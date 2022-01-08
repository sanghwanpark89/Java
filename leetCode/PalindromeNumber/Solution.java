package PalindromeNumber;

import java.util.*;

public class Solution {
	
	public boolean isPalindrome(String s) {
		
		String reverseString = "";
		//Instance variable should have value before using.
		
		for(int i = (s.length()-1); i >= 0; i--) {
		//for loop will be executed from last of string and reversed.
			reverseString = reverseString + s.charAt(i);
			//reversed character will be saved into reverseString variable.
		}
		
		if(s.toLowerCase().equals(reverseString.toLowerCase())) {
		//if two lower case of strings is same, it will return true
			return true;
		}
		return false;
		//if not, it will return false
	}

}
