package problem17;

public class Queue <T> {
    Node<T> head;
    Node<T> tail;
    
    public Queue() {
        head = null;
        tail = null;
    }
    
    public void enqueue(T data) {
        Node<T> node = new Node(data);
        node.setNext(null);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }
    
    public T dequeue() {
        Node<T> node = head;
        head = node.getNext();
        
        T e = node.getValue();
        node.setNext(null);
        node.setValue(null);
        
        if (head == null) {
            tail = null;
        }
        
        return e;
    }
    
    public T peek() {
        return head == null ? null : head.getValue();
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getValue() + ",");
            node = node.getNext();
        }
    }
    
    public String printToString() {
        Node<T> node = head;
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.getValue() + ",");
            node = node.getNext();
        }
        return sb.toString();
    }
}
