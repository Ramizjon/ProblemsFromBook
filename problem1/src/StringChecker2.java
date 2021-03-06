import java.util.HashSet;
import java.util.Set;




public class StringChecker1 implements StringChecker {

	//Solution with use of Set as an additional data structure  
	//based on uniqueness of all Set elements.
	public boolean checkAllUniqueChars (String inputString){
		Set <Character> charSet = new HashSet <Character> ();
		char [] charArray = inputString.toCharArray();
		
		for (char c: charArray)
			charSet.add(new Character (c));

		return (charSet.size() == charArray.length);
	}

}
