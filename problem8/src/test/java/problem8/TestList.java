package problem8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestList {

	@Test
	public void test() {
		CustomLinkedList<Integer> list = new CustomLinkedList<Integer>(1);
		list.add(6).add(10).add(8).add(10).add(10).add(11).add(6).add(34).add(6);
		assertEquals(11, (int)list.findNFromEnd(3));
		assertEquals(6, (int)list.findNFromEnd(0));
		assertEquals(1, (int)list.findNFromEnd(3000));
		assertEquals(6, (int)list.findNFromEnd(-3000));
	}

}
