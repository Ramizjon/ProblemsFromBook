package main;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		StringCompressor sc = new StringCompressor();
		System.out.println(sc.compressString("aabcccccaaa"));
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("puppy");
		list.add("daddy");
		ArrayList<String> newList = (ArrayList<String>) list.stream().filter(item -> item.startsWith("p")).collect(Collectors.toList());
		System.out.println(newList.get(0));
	}

}
