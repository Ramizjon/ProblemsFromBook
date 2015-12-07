package problem12;

import customlinkedlist12.CustomLinkedList;

public class Main {

	public static void main(String[] args) {
		CustomLinkedList<Character> list = new CustomLinkedList<Character>(Character.valueOf('a'));
		list.add('b').add('c').add('d').add('e');
		PalindromeChecker pc = new PalindromeChecker();
		//pc.isPalindrome(list.getHead());
	System.out.println(pc.isPalindrome(list.getHead()));
	}

}
