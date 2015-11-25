package problem1;

public class StringChecker2 {

	/**
	 * Solution without using any additional data structures
	 * @param inputString - string that is going to be checked
	 * @return true if string has all unique characters, <br> false - otherwise
	 */
		public boolean checkAllUniqueChars (String inputString){
			char [] charArray = inputString.toCharArray();
			for (char c: charArray){
				if (inputString.indexOf(c)!=inputString.lastIndexOf(c))
					return false;
			}
			return true;
		}
}
