public class Node{
    int val;
    int key;// we need this why?
    Node next;
    Node prev;

   public Node(int key , int val){
        this.val = val;
        this.key = key;
        this.next = null; 
        this.prev = null; 
    }
}

class LRUCache {
    int cap;
    Map<Integer, Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        
    }// 1->2->3, if size == limit , remove head element , head = head.next 
    
    public int get(int key) {
        //get the value from the key , insert at head if exists else return -1
        if(!cache.containsKey(key)) return -1;
        else{
            Node n = cache.get(key);
            delete(n);//delete from the existing place
            insert(n);//put at MRU
            return n.val;
        }       
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){//if key already exists
            delete(cache.get(key));//remove that node
        }

        //insert first:
        Node nd = new Node(key,value);//create the node
        cache.put(key, nd);//put fresh value in map
        insert(nd);// insert node at MRU
        
        //evict then:

            if(cache.size()>this.cap){
            //evict the LRU 
            Node lru = tail.prev;
            delete(lru);
            cache.remove(lru.key);//remove from the map too, for that we need key 
            }
      
        
    }

    public void insert(Node node){
        Node oldFirst = head.next;

         node.next = oldFirst;
         node.prev = head;

        oldFirst.prev = node;
        head.next = node;

    }

    public void delete(Node node){
        Node nextNode = node.next;
        Node prevNode = node.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
  
}

