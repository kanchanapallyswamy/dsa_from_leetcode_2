
class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private Node head = null; 
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    private void remove(Node node) {
        if (node.next == node) {
            head = null; 
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            if (node == head) {
                head = head.next;
            }
        }
    }

    private void insertAtFront(Node node) {
        if (head == null) {
            node.next = node;
            node.prev = node;
            head = node;
        } else {
            Node tail = head.prev;
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head.prev = node;
            head = node;
        }
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);
        remove(node);
        insertAtFront(node);
        map.put(key, head); 
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node existing = map.get(key);
            remove(existing);
            map.remove(key);
        }

        if (map.size() == capacity) {
            Node lru = head.prev; 
            remove(lru);
            map.remove(lru.key);
        }

        Node newNode = new Node(key, value);
        insertAtFront(newNode);
        map.put(key, newNode);
    }
}
