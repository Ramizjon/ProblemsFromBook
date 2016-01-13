package problem11;

import customlinkedlist.CustomLinkedList;
import customlinkedlist.Node;

public class LinkedListNumbers {
	
	/**
	 * Extracts two digits represended by two linked lists <br>
	 * And summarizes them afterwards
	 * @param listOne - first digit sequence
	 * @param listTwo - second digit sequence
	 * @return sum of two numbers
	 */
	public int sumLists (CustomLinkedList <Integer> listOne, CustomLinkedList <Integer> listTwo){
		Node currentOne = listOne.head;
		Node currentTwo = listTwo.head;
		StringBuilder sb1 = new StringBuilder(String.valueOf(currentOne.getData()));
		StringBuilder sb2 = new StringBuilder(String.valueOf(currentTwo.getData()));
		while(currentOne.hasNext()){
			currentOne = currentOne.getNext();
			sb1.append(currentOne.getData());
		}
		while(currentTwo.hasNext()){
			currentTwo = currentTwo.getNext();
			sb2.append(currentTwo.getData());
		}
		return Integer.valueOf(sb1.toString())+Integer.valueOf(sb2.toString());
	}
}
