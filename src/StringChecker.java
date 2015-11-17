import java.util.HashSet;
import java.util.Set;


//TASK:
//Implement an algorithm to determine if a string has all unique characters. 
//What if you cannot use additional data structures?


public class StringChecker {

	public static void main(String[] args) {
		System.out.println (checkAllUniqueChars1("ramiz"));
		System.out.println (checkAllUniqueChars2("ramiz"));
	}
	
	//Solution with use of Set as an additional data structure
	public static boolean checkAllUniqueChars1 (String inputString){ 
		Set <Character> charSet = new HashSet <Character> ();
		char [] charArray = inputString.toCharArray();
		
		for (char c: charArray)
			charSet.add(new Character (c));
		
		return (charSet.size() == charArray.length);
	}
	
	//Solution without using any additional data structures
	public static boolean checkAllUniqueChars2 (String inputString){
		char [] charArray = inputString.toCharArray();
		for (char c: charArray){
			if (inputString.indexOf(c)!=inputString.lastIndexOf(c))
				return false;
		}
		return true;
	}

}
