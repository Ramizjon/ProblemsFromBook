package problem13;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5).push(1).push(3).push(4).push(10);
		assertEquals("1", stack.getMin().toString());
	}

}
