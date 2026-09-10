class MyCircularQueue {
    Queue <Integer> q;
    int capacity;
    public MyCircularQueue(int k) {
         q=new LinkedList<>();
         capacity=k;

    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            q.add(value);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deQueue() {
        if(!q.isEmpty()){
            q.remove();
            return true;
        }else{
            return false;
        }
    }
    
    public int Front() {
        if(!q.isEmpty()){
            return q.peek();
        }else{
            return -1;
        }
    }
    
    public int Rear() {
        if(!q.isEmpty()){
            return ((LinkedList<Integer>) q).peekLast();
        }else{
            return -1;
        }
    }
    
    public boolean isEmpty() {
        return q.isEmpty();
    }
    
    public boolean isFull() {
       return capacity==q.size();
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */