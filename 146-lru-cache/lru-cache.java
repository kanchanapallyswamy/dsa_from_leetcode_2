class LRUCache {
    class Node{
        int key , value;
        Node next , prev;
        public Node(int key , int value){
            this.key = key;
            this.value = value;
        }
    }
    Map<Integer , Node> mp;
    Node head , tail;
    int capacity;
    public LRUCache(int capacity) {
    this.capacity = capacity;
    mp = new HashMap<>();
    this.head = new Node(0 , 0);
    this.tail = new Node(0 , 0);
    head.next = tail;
    tail.prev = head;
    }
    public void addAtHead(Node node){
        Node nodeAfterHead = head.next;
        node.next = nodeAfterHead;
        node.prev = head;
        nodeAfterHead.prev = node;
        head.next = node;
    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        Node nn = mp.get(key);
        remove(nn);
        addAtHead(nn);
        return nn.value;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            remove(mp.get(key));
            mp.remove(key);
        }
        if(mp.size() == capacity){
            mp.remove(tail.prev.key);
            remove(tail.prev);
        }
        Node nn = new Node(key , value);
        addAtHead(nn);
        mp.put(key , nn);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */