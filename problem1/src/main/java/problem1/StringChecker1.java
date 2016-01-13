package problem1;

import java.util.HashSet;
import java.util.Set;

public class StringChecker1 implements StringChecker {

	/**
	 * Solution with use of Set as an additional data structure  <br>
		based on uniqueness of all Set elements.
		@param inputString - string that is going to be checked
		@return true if string has all uniue characters, <br> false - otherwise
	 */
	public boolean checkAllUniqueChars (String inputString){
		Set <Character> charSet = new HashSet <Character> ();
		char [] charArray = inputString.toCharArray();
		
		for (char c: charArray)
			charSet.add(new Character (c));

		return (charSet.size() == charArray.length);
	}

}