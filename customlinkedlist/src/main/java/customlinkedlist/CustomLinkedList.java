package customlinkedlist;

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
