package test;
import static org.junit.Assert.*;
import main.SpacesReplacer;

import org.junit.Test;

public class ReplacerTest  {

	@Test
	public void testReplacer() {
		SpacesReplacer sr = new SpacesReplacer();
		char [] input = {'M','r',' ','J','o','h','n',' ','c','o'};
		String expectedResult = "Mr%20John%20co";
		assertEquals (expectedResult, sr.replaceSpaces(input));
	}

}
