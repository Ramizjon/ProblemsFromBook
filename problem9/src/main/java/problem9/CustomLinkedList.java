package problem9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import problem9.CustomLinkedList;

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
		System.out.print("\n" + current.data + " ");
		while (current.next != null){
			current = current.next;
			System.out.print(current.data + " ");
		}
	}
	
	/**
	 * Deletes middle node from a singly linked list. <br><br>
	 * <b> Algorithm: </b><br>
	 * Firstly we iterate through list only one time to find the middle node. <br>
	 * After that we assume that fact, that we have access only to the middle node. <br>
	 * The main idea is to transform our middle node to next node by assigning it's value to it. <br>
	 * Then we just simply use next of next node to middle node pointer to bind these two nodes <br>
	 * Actually we don't delete actual middle node, but it's value.
	 * 
	 * @return void
	 * 
	 */
	public void deleteMiddleNode(){
		Node mover = this.head;
		Node middle = mover;
		while (mover.next != null){
			mover = mover.next;
			if (mover.next != null){
				mover = mover.next;
				middle = middle.next;
			}
		}
		middle.data = middle.next.data;
		middle.next = middle.next.next;
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
