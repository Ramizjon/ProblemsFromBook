package problem8;

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
