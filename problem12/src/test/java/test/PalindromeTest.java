package test;

import static org.junit.Assert.*;

import org.junit.Test;

import problem12.PalindromeChecker;
import customlinkedlist12.CustomLinkedList;

public class PalindromeTest {

	@Test
	public void testPalindrome() {
		CustomLinkedList<Character> list = new CustomLinkedList<Character>(Character.valueOf('a'));
		list.add('b').add('c').add('b').add('a');
		PalindromeChecker pc = new PalindromeChecker();
		assertEquals(true, pc.isPalindrome(list));
	}
	
	@Test
	public void testNonPlaindrome(){
		CustomLinkedList<Character> list = new CustomLinkedList<Character>(Character.valueOf('r'));
		list.add('a').add('m').add('i').add('z');
		PalindromeChecker pc = new PalindromeChecker();
		assertEquals(false, pc.isPalindrome(list));
	}

}
