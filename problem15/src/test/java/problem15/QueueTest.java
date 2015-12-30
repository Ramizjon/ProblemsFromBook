package problem15;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test() {
		StackBasedQueue<Integer> myQueue = new StackBasedQueue<Integer>(10);
		myQueue.enqueue(1).enqueue(2).enqueue(3);
		assertEquals("123", myQueue.toString());
	}

}
