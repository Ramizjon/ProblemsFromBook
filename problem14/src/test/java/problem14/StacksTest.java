package problem14;

import static org.junit.Assert.*;

import org.junit.Test;

public class StacksTest {

	@Test
	public void test() {
		StacksController<Integer> stacks = new StacksController<Integer>();
		for (int i = 0; i < 10; i++){
			stacks.push(i);
		}
		assertEquals(String.valueOf(9), stacks.pop().toString());
		assertEquals(String.valueOf(8), stacks.pop().toString());
		assertEquals(String.valueOf(7), stacks.pop().toString());
	}

}
