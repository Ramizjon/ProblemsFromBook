package problem2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComparator {

	@Test       
	public void testComparator() {
		StringComparator sc = new StringComparator();
		boolean result = sc.compareStrings("mouse", "somue");
		assertEquals(true, result);
	}

}
