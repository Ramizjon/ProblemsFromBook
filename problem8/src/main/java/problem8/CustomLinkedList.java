package problem8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomLinkedList <T> {
	
	public Node head;
	
	public CustomLinkedList (T data){
		this.head = new Node (data);
	}
	
	/**
	 * Adds a new node with entered value
	 * @param data - integer value to be added
	 * @return reference to itself for convenient adding
	 */
	public CustomLinkedList add (T data) {
		Node current = this.head;
		while (current.next != null){
			current = current.next;
		}
		current.next = new Node (data);
		return this;
	}
	
	/**
	 * Removes node by selected value.
	 * @param data - integer value used as key to delete node
	 */
	public void removeNode (T data){
		if (head.data == data){
			this.head = head.next;
		}
		Node current = this.head;
		while (current.next != null){
			if (current.next.data == data){
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}
	

	
	/**
	 * Prints list contents to stdout
	 */
	public void print (){
		Node current = this.head;
		System.out.print(current.data + " ");
		while (current.next != null){
			current = current.next;
			System.out.print(current.data + " ");
		}
	}
	

	/**
	 * Finds an N'th element from the end of list. <br><br>
	 * <b> Algorithm: </b> <br>
	 * We create two pointer for our linked list. <br>
	 * The first one iterates to N'th position of the list. <br>
	 * Then list is iterated one more time with both pointers till first pointer reaches the end of it. <br>
	 * After iteration is done, second pointer's offset is K-N, where K is first pointer's current position (EOL)<br>
	 * Algorithms complexity is O(2N)
	 * @param n - integer offset for search 
	 * @return found data
	 */
	public T findNFromEnd (int n){
		Node pointerOffset = this.head;
		while ((n > 0) && (pointerOffset.next != null)){
			pointerOffset = pointerOffset.next;
			n--;
		}
		Node currentPointer = this.head;
		while (pointerOffset.next != null){
			pointerOffset = pointerOffset.next;
			currentPointer = currentPointer.next;
		}
		return (T) currentPointer.data;
	}
	
	
	/**
	 * String representation of linked list
	 */
	
	public String toString (){
		Node current = this.head;
		StringBuilder sb = new StringBuilder();
		sb.append(current.data);
		while (current.next != null){
			current = current.next;
			sb.append(current.data);
		}
		return sb.toString();
	}
}
