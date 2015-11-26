package test;
import static org.junit.Assert.*;

import org.junit.Test;

import problem7.CustomLinkedList;


public class TestList {

	@Test
	public void testRemoveDuplicates() {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>(5);
		list.add(6).add(10).add(8).add(10).add(10).add(11).add(6).add(34).add(6);
		list.removeDuplicatesHash();
		assertEquals("345681011", list.toString());
	}
	
	@Test
	public void testDuplicatesOnly (){
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>(1);
		list.add(1).add(1).add(1).add(1).add(1);
		list.removeDuplicatesHash();
		System.out.println(list.toString());
		assertEquals("1", list.toString());
	}
	
	@Test
	public void testChars (){
		CustomLinkedList<Character> list = new CustomLinkedList<Character>(new Character('t'));
		list.add('a').add('b').add('c').add('b');
		list.removeDuplicatesHash();
		assertEquals("abct", list.toString());
	}

}
