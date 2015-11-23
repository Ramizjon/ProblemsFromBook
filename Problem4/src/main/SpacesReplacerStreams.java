package main;

import java.util.ArrayList;

public class SpacesReplacerStreams implements Replacer{

	@Override
	public String replaceSpaces(char[] inputString) {
		ArrayList <Character> charactersList = new ArrayList<Character>();
		
		for (char c: inputString){
			charactersList.add(new Character(c));
		}
		
		//charactersList.stream().filter((s) -> s)
		
		return null;
	}

}
