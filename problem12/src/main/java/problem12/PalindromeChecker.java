package problem12;

import customlinkedlist12.CustomLinkedList;
import customlinkedlist12.Node;

public class PalindromeChecker <T> {

	/**
	 * Reverses linked list
	 * @param currentNode - first Node to be reversed from. Usually it is head.
	 * @return node - new pointer to 
	 */
	public  Node reverseLinkedList(Node currentNode)  {   
		Node previousNode=null;  
		Node nextNode;  
		while(currentNode!=null)  {  
		nextNode=currentNode.getNext();
		currentNode.setNext(previousNode);  
		previousNode=currentNode;  
		currentNode=nextNode;  
	    }  
	  return previousNode;  
	 }
	
	/**
	 * Checks if an input list is palindrome.
	 * @param list - list to be checked
	 * @return true if palindrome, <br>false otherwise
	 */
	public boolean isPalindrome (CustomLinkedList<T> list) {
		CustomLinkedList<T> normalList = new CustomLinkedList<T>((T) list.head.getData());
		Node runner = list.getHead();
		while (runner.getNext() != null){
			runner = runner.getNext();
			normalList.add((T)runner.getData());
		}
		normalList.print();
		CustomLinkedList<T> reversedList = new CustomLinkedList<T>(reverseLinkedList(list.getHead()));
		Node current = normalList.getHead(); 
		Node currentRev = reversedList.getHead();
		while (current.getNext() != null){
			System.out.println(current.getData() + "  " + currentRev.getData());
			if (current.getData() != currentRev.getData()){
				return false;
			}
			current = current.getNext();
			currentRev = currentRev.getNext();
		}
		return true;
	}
}
