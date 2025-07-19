import java.util.*;

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
    private final Map<Integer, Node> cache;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtFront(Node node) {
        
        Node nextt = head.next;
        nextt.prev = node;
        node.next = nextt;
        head.next = node;
        node.prev = head;
        // node.next = head.next;
        // node.prev = head;
        // head.next.prev = node;
        // head.next = node;
    }

    public int get(int key) {
        if (!cache.containsKey(key))
            return -1;

        Node node = cache.get(key);
        remove(node);
        insertAtFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node existingNode = cache.get(key);
            remove(existingNode);
            //cache.remove(key); // \U0001f527 fix here

        }

        else if (cache.size() == capacity) {
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }

        Node newNode = new Node(key, value);
        insertAtFront(newNode);
        cache.put(key, newNode);
    }
}
