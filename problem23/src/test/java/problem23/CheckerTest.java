package problem23;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckerTest {

	@Test
	public void test() {
		NumberChecker nc = new NumberChecker();
		assertEquals(2, nc.getBitSwapCount(31, 14));
		assertEquals(3, nc.getBitSwapCount(25, 18));
	}

}
