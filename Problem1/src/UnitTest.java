import static org.junit.Assert.*;

import org.junit.Test;


public class UnitTest {

	@Test
	public void testAllUnique1 (){
		StringChecker stringChecker = new StringChecker ();
		assertEquals(stringChecker.checkAllUniqueChars1("Ramiz"), true);
	}
	
	@Test
	public void testAllUnique2 (){
		StringChecker stringChecker = new StringChecker ();
		assertEquals(stringChecker.checkAllUniqueChars2("Hello"), false);
	}
}
