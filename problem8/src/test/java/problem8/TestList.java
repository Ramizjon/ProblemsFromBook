package problem8;

import static org.junit.Assert.*;

import org.junit.Test;

import customlinkedlist.CustomLinkedList;

public class TestList {

	@Test
	public void test() {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>(1);
		NFinder<Integer> finder = new NFinder<Integer>();
		list.add(6).add(10).add(8).add(10).add(10).add(11).add(6).add(34).add(6);
		assertEquals(11, (int)finder.findNFromEnd(3, list));
		assertEquals(6, (int)finder.findNFromEnd(0,list));
		assertEquals(1, (int)finder.findNFromEnd(3000,list));
		assertEquals(6, (int)finder.findNFromEnd(-3000,list));
	}

}
