import java.util.HashSet;
import java.util.Set;

public interface StringChecker2 implements{
	
	//Solution without using any additional data structures
	public boolean checkAllUniqueChars (String inputString){
		char [] charArray = inputString.toCharArray();
		for (char c: charArray){
			if (inputString.indexOf(c)!=inputString.lastIndexOf(c))
				return false;
		}
		return true;
	}

}
