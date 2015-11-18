import java.util.Arrays;

//TASK:
//Given two strings.
//Write a method to decide if one is a permutation of the other.

public class StringComparator {
	public boolean compareStrings (String firstStr, String secondStr){
		char [] firstStringChars = firstStr.toCharArray();
		char [] secondStringChars = secondStr.toCharArray();
		Arrays.sort(firstStringChars);
		Arrays.sort(secondStringChars);
		
		//simply compare sorted Strings for elements equality
		if (Arrays.equals(firstStringChars, secondStringChars))
			return true;
		
		return false;
	}
}
