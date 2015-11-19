import java.util.ArrayList;

//TASK:
//Implement a method to perform basic string compression using the counts
//of repeated characters. For example, the string "aabcccccaaa" would become
//"a2b1c5a3". If the compressed string would not become smaller than
//the original string, your method should return the original string.

public class StringCompressor {
	
	public String compressString (String inputString){
		
		char [] charsFromString = inputString.toCharArray();
		StringBuilder sb = new StringBuilder ();

		int counter = 1;
		for (int i = 0; i < charsFromString.length; i++){
			if ((i!=charsFromString.length-1) && (charsFromString[i]==charsFromString[i+1])){
				counter++;
			}
			else {
				sb.append(String.valueOf(charsFromString[i]));
				sb.append(String.valueOf(counter));
				counter=1;
			}
		}
		return (inputString.length()>sb.length())?sb.toString():inputString;
	}
}