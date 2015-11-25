package main;
//TASK:
//Write a method to replace all spaces in a string with '%20'.
//You may assume that the string has sufficient space at the end of the string
//to hold the additional characters. 
//If implementing in Java, please use a character array.

public class SpacesReplacer implements Replacer {
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
