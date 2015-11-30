package test;

import static org.junit.Assert.*;

import org.junit.Test;

import problem9.CustomLinkedList;

public class TestList {

	@Test
	public void test() {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>(1);
		list.add(6).add(10).add(8).add(10).add(55).add(11).add(6).add(34);
		list.deleteMiddleNode();
		assertEquals("161085511634", list.toString());
	}
	

}
