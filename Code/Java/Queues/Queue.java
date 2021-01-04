public class Queue {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    
    public Queue() {
      this(DEFAULT_MAX_SIZE);
    }
    
    public Queue(int maxSize) {
      this.queue = new LinkedList();
      this.size = 0;
      this.maxSize = maxSize;
    }
    
    public boolean hasSpace() {
      return this.size < this.maxSize;
    }
    
    public boolean isEmpty() {
      return this.size == 0;
    }
    
    public void enqueue(String data) {
      this.queue.addToTail(data);
      this.size++;
    }
    
    public String dequeue() {
      String data = this.queue.removeHead();
      this.size--;
      return data;
    }
    
    public String peek() {
      return this.queue.head.data;
    }
    

}