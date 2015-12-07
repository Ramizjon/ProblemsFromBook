package problem12;

import customlinkedlist12.CustomLinkedList;
import customlinkedlist12.Node;

public class PalindromeChecker <T> {

	public  Node reverseLinkedList(Node currentNode)  
	 {  // For first node, previousNode will be null  
		Node previousNode=null;  
		Node nextNode;  
		while(currentNode!=null)  
		{  
		nextNode=currentNode.getNext();
		// reversing the link 
		currentNode.setNext(previousNode);  
		// moving currentNode and previousNode by 1 node  
		previousNode=currentNode;  
		currentNode=nextNode;  
	    }  
	  return previousNode;  
	 }  
	
	public boolean isPalindrome (Node head){
		CustomLinkedList<T> normalList = new CustomLinkedList<T>(head);
		CustomLinkedList<T> reversedList = new CustomLinkedList<T>(reverseLinkedList(head));
		normalList.print();
		reversedList.print();
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
