package com.ramiz;

/**
 *TASK:
 *assume you uhave a method isSubString which checks if one
 *word is a substring od another. Given two strings, s1 and s2, write code to check
 *if s2 is a rotation of s1 using only one call to isSubString method.
 * 
 * @author ramiz
 *
 */


public class RotationChecker {
	public boolean areRotated (String str1, String str2){
		if (str1.length()!=str2.length())
			return false;
		return ((str2.concat(str2).contains(str1)));
	}
}
