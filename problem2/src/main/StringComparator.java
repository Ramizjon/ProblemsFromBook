package main;
import java.util.Arrays;

/**
 *  TASK: <br>
 * Given two strings. <br>
 * Write a method to decide if one is a permutation of the other.
 * 
 * @author Ramiz
 * @version 1.0
 * 
 * 
 */

public class StringComparator {
	
	
	/**
	 * 
	 * @param firstStr - first String to be compared
	 * @param secondStr - second String to be compared
	 * @return true if one string is permutation of the other, false otherwise
	 */
	public boolean compareStrings (String firstStr, String secondStr){
		char [] firstStringChars = firstStr.toCharArray();
		char [] secondStringChars = secondStr.toCharArray();
		Arrays.sort(firstStringChars);
		Arrays.sort(secondStringChars);
		
		//simply compare sorted Strings for elements equality
		return Arrays.equals(firstStringChars, secondStringChars);
	}
}
