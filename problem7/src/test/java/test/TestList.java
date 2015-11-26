package test;
import static org.junit.Assert.*;

import org.junit.Test;

import problem7.CustomLinkedList;


public class TestList {

	@Test
	public void testRemoveDuplicates() {
		CustomLinkedList list = new CustomLinkedList(50);
		for (int i = 0; i < 10; i++){
			list.add(i+1);
		}
		list.add(6).add(8).add(10); //adding duplicates
		list.removeDuplicates();
		assertEquals("50123457968", list.toString());
	}
	
	@Test
	public void testWithoutDuplicates (){
		CustomLinkedList list = new CustomLinkedList(50);
		for (int i = 0; i < 10; i++){
			list.add(i+1);
		}
		list.removeDuplicates();
		System.out.println(list.toString());
		assertEquals("50123456789", list.toString());
	}

}
