import java.util.HashSet;
import java.util.Set;


public class StringChecker {

	public static void main(String[] args) {
		System.out.println (checkAllUniqueChars1("ramiz"));
		System.out.println (checkAllUniqueChars2("ramiz"));
	}
	
	public static boolean checkAllUniqueChars1 (String inputString){
		Set <Character> charSet = new HashSet <Character> ();
		char [] charArray = inputString.toCharArray();
		
		for (char c: charArray)
			charSet.add(new Character (c));
		
		return (charSet.size() == charArray.length);
	}
	
	public static boolean checkAllUniqueChars2 (String inputString){
		char [] charArray = inputString.toCharArray();
		for (char c: charArray){
			if (inputString.indexOf(c)!=inputString.lastIndexOf(c))
				return false;
		}
		return true;
	}

}
