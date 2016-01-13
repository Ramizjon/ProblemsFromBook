package problem11;

import static org.junit.Assert.*;

import org.junit.Test;

import customlinkedlist.CustomLinkedList;

public class SumTester {

	@Test
	public void test() {
		CustomLinkedList<Integer> list1 = new CustomLinkedList<Integer>();
		CustomLinkedList<Integer> list2 = new CustomLinkedList<Integer>();
		list1.add(6).add(1).add(7);
		list2.add(2).add(9).add(5);
		LinkedListNumbers worker = new LinkedListNumbers();
		assertEquals(912, worker.sumLists(list1, list2));
	}

}
