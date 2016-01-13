package customlinkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomLinkedList <T extends Comparable<T>> {
	
	public Node head;
	
	public CustomLinkedList (T data){
		this.head = new Node (data);
	}
	
	public CustomLinkedList (){
		this.head = new Node ();
	}
	
	/**
	 * Adds a new node with entered value.
	 * @param data - integer value to be added
	 * @return reference to itself for convenient adding
	 */
	public CustomLinkedList <T> add (T data) {
		if (head.data == null){
			head.data = data;
			return this;
		}
		Node<T> current = this.head;
		while (current.next != null){
			current = current.next;
		}
		current.next = new Node (data);
		return this;
	}
	
	public CustomLinkedList <T> addNode (Node node){
		if (head.data == null){
			this.head = node;
			return this;
		}
		Node<T> current = this.head;
		while (current.next != null){
			current = current.next;
		}
		current.next = node;
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
	 * Partitions a list around a value.
	 * <br><b>Algorithm: </b><br><br>
	 * In order to partition list into two parts: first which elements will be greater than input value, <br>
	 * and second which elements will be less than it, we create two lists. <br>
	 * Then while iterating through our main list only one time, we simply compare  current element with input value <br>
	 * and add it to appropriate list. Lesser items are being stored in the first list, and greater - in the second. <br>
	 * Then we concatenate two lists and receive the ready one.
	 * 
	 * @param value - pivot of partition.
	 */
	public void partitionByValue(T value){
		CustomLinkedList<T> listLess = new CustomLinkedList <T>();
		CustomLinkedList<T> listGreater = new CustomLinkedList<T> ();
		Node<T> pivot = new Node <T>(value);
		Node <T>current = this.head;
		if (this.head.compareTo(pivot) < 0){
			listLess.add(current.data);
		}
		else listGreater.add(current.data);
		while (current.hasNext()){
			current = current.next;
			if (current.compareTo(pivot) < 0){
				listLess.add(current.data);
			}
			else if (current.compareTo(pivot) > 0) listGreater.add(current.data);
		}
		listLess.add(value);
		listLess.addNode(listGreater.head);
		this.head = listLess.head;
	}

	/**
	 *String representation of linked list
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
