package customlinkedlist;

/**
 * Linked list base element
 * @author Ramiz
 *
 */
public class  Node<T extends Comparable<T>> implements Comparable<Node<T>> {
	Node next;
	T data;
	
	public Node (T value){
		this.data = value;
	}
	
	public T getData (){
		return this.data;
	}
	
	public Node getNext (){
		return this.next;
	}
	
	public Node() {
		this.data = null;
	}
	
	public boolean hasNext(){
		return this.next != null;
	}
	
	@Override
	public boolean equals (Object o){
		if (o == null) return false;
		if (!(o instanceof Node)) return false;
		return (this.data == ((Node)o).data);
	}
	
	@Override
	public int hashCode (){
		return data.hashCode();
	}
	
	public int compareTo(T value) {
        return data.compareTo(value);
    }

	public int compareTo(Node<T> value) {
		return data.compareTo(value.data);
	}
	
}
