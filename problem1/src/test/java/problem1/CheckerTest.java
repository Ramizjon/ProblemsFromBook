package problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckerTest {

	public void testAllUnique (){
		StringChecker1 stringChecker1 = new StringChecker1 ();
		StringChecker2 stringChecker2 = new StringChecker2 ();
		assertEquals(stringChecker1.checkAllUniqueChars("Ramiz"), true);
		assertEquals(stringChecker2.checkAllUniqueChars("Fridge"), true);
	}
	
	@Test
	public void testSomeDifferentChars (){
		StringChecker1 stringChecker1 = new StringChecker1 ();
		StringChecker2 stringChecker2 = new StringChecker2 ();
		assertEquals(stringChecker1.checkAllUniqueChars("Hello"), false);
		assertEquals(stringChecker1.checkAllUniqueChars("Illegal"), false);
	}

	@Test
	public void testEmptyString (){
		StringChecker1 stringChecker1 = new StringChecker1 ();
		StringChecker2 stringChecker2 = new StringChecker2 ();
		assertEquals(stringChecker1.checkAllUniqueChars(""), true);
		assertEquals(stringChecker1.checkAllUniqueChars(""), true);
	}
}
