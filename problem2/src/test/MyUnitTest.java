package test;

import static org.junit.Assert.*;
import main.StringComparator;

import org.junit.Test;


public class MyUnitTest {
   
	@Test       
	public void testComparator() {
		StringComparator sc = new StringComparator();
		boolean result = sc.compareStrings("mouse", "somue");
		assertEquals(true, result);
	}

}
