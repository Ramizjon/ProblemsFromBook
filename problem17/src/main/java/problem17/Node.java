package problem17;

public class Node <T> {
	private T data;
    private Node<T> next;
    
    public Node(T data) {
        setValue(data);
    }
    
    public T getValue() {
        return data;
    }
    
    public void setValue(T data) {
        this.data = data;
    }
    
    public Node<T> getNext()  {
        return next;
    }
    
    public void setNext(Node<T> node) {
        this.next = node;
    }
    
    public String toString() {
        return data.toString();
    }
}
