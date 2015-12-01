package main;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



/**
 * TASK:<br>
 * Implement a method to perform basic string compression using the counts 
 * of repeated characters. For example, the string "aabcccccaaa" would become 
 * "a2b1c5a3". <br> If the compressed string would not become smaller than 
 * the original string, your method should return the original string. <br>
 * @author Ramiz
 * 
 *
 */
public class StringCompressor {
	
	/**
	 * Performs basic string compression
	 * @param inputString - string to be compressed
	 * @return  compressed string
	 */
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
	
	public String compressString1 (String inputString){
		/*Map<String, Long> counted = inputString.chars().
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/
		
		return null;
	}
	
}
