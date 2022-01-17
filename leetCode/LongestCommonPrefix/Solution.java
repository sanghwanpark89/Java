package LongestCommonPrefix;

import java.util.*;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
		
		if(strs.length == 0) {
		//if strs.length or array is empty, it will return empty string
			return "";
		}
		
		else {
		//if not it will follow below code
			
			for(int i = 0; i < strs[0].length(); i++) {
			//for loop will be executed until i is less than length of first element
				
				char c = strs[0].charAt(i);
				//character variable c will have character of first element each time when for loop is executed
				
				for(int j = 1; j < strs.length; j++) {
				//for loop will be executed j is less than length of array
					
					if(i >= strs[j].length() || c != strs[j].charAt(i)) {
					//if i is greater than length of strs or c is not equal to strs
						return strs[0].substring(0,i);
						//it will return longest prefix among the strings
					}
				}
			}
		}
		return strs[0];
	}

}
