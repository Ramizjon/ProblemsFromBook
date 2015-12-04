package problem11;

import customlinkedlist.CustomLinkedList;

public class Main {

	public static void main(String[] args) {
		CustomLinkedList<Integer> list1 = new CustomLinkedList<Integer>();
		CustomLinkedList<Integer> list2 = new CustomLinkedList<Integer>();
		list1.add(6).add(1).add(7);
		list2.add(2).add(9).add(5);
		LinkedListNumbers worker = new LinkedListNumbers();
		System.out.println(worker.sumLists(list1, list2));
		
	}

}
