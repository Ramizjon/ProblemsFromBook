package test;

import org.junit.Test;

import main.RotationChecker;
import junit.framework.TestCase;

public class RotationTest extends TestCase {

	@Test
	public void testRotationCheck (){
		RotationChecker rc = new RotationChecker ();
		assertEquals (true,rc.areRotated("waterbottle", "erbottlewat"));
	}
	
	@Test
	public void testShorterString () {
		RotationChecker rc = new RotationChecker ();
		assertEquals (false,rc.areRotated("waterbot", "erbottlewat"));
	}
	
	@Test
	public void testReversed (){
		RotationChecker rc = new RotationChecker ();
		assertEquals (false,rc.areRotated("mouse", "esuom"));
	}
	
	@Test
	public void testEmptyStrings(){
		RotationChecker rc = new RotationChecker ();
		assertEquals (false,rc.areRotated("", "otherString"));
	}
}
