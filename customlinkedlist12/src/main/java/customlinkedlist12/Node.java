package customlinkedlist12;
/**
 * Linked list base element
 * @author Ramiz
 *
 */
public class Node <T> {
	Node next;
	T data;
	
	public Node (T data){
		this.data = data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public T getData(){
		return this.data;
	}
	
	
	public void setNext(Node next) {
		this.next = next;
	};
	
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
	
}
