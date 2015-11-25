package main;

/**
 * TASK:
Write a method to replace all spaces in a string with '%20'. <br>
You may assume that the string has sufficient space at the end of the string
to hold the additional characters. <br>
If implementing in Java, please use a character array.

 * @author Ramiz
 *
 */
public class SpacesReplacer implements Replacer {
	
	/** Replaces all spaces in char array with "%20"
	 *  @param char[] inputString - array for processing
	 *  @return string with replaced spaces
	 */ 
	public String replaceSpaces (char[] inputString){
		int spacesCounter=0, resultIndex=0;
		for (int i=0;i<inputString.length;i++){
			if (inputString[i]==' ')
				spacesCounter++;
		}
		char [] resultString = new char [inputString.length+spacesCounter*2];
		
		for (int i = 0; i < inputString.length; i++){
			if (inputString[i]==' '){
				resultString[resultIndex++]='%';
				resultString[resultIndex++]='2';
				resultString[resultIndex++]='0';
			}
			else 
				resultString[resultIndex++]=inputString[i];
		}
		return new String (resultString);
	}
	
	
}
