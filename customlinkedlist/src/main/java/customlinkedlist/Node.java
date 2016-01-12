package customlinkedlist;

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
	
	public T getData (){
		return this.data;
	}
	
	public Node getNext (){
		return this.next;
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
	
}
