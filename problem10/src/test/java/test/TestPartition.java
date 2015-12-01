package test;

import static org.junit.Assert.*;

import org.junit.Test;

import problem10.CustomLinkedList;

public class TestPartition {

	@Test
	public void testIntegers() {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
		list.add(8).add(45).add(32).add(5).add(10).add(11).add(15).add(33);
		list.partitionByValue(11);
		assertEquals("85101145321533", list.toString());
	}
	
	@Test
	public void testCharacters() {
		CustomLinkedList<Character> list = new CustomLinkedList<Character>();
		list.add('f').add('a').add('z').add('q').add('r').add('w').add('b').add('c');
		list.partitionByValue('r');
		assertEquals("faqbcrzw", list.toString());
	}

}
