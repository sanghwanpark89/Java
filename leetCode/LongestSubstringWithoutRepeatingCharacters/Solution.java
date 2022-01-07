package LongestSubstringWithoutRepeatingCharacters;

import java.util.*;
public class Solution {
	
	public int lengthOfLongestSubstring(String s) {
		
		int myLength = s.length();
		//n is length of string S
		
		int myAnswer = 0;
		//initial answer is zero
		
		Map<Character, Integer> myMap = new HashMap<>();
		//Declare the map and will save the character as key and integer as value
		
		for(int left = 0, right = 0; right < myLength; right++) {
		//for loop will be executed until variable i meet the mylength
			
			if(myMap.containsKey(s.charAt(right))) {
			//if myMap contains key which is character,	
				
				left = Math.max(myMap.get(s.charAt(right)),left);
				//the left pointer will be stored into left variable
			}
			
			myAnswer = Math.max(right-left+1, myAnswer);
			//answer will be the longest one between (right-left+1 and myAnswer)
//			System.out.println("myAnswer is " + myAnswer);
//			System.out.print(myMap);
//			System.out.println();
//			System.out.println(myMap.size());
			
			myMap.put(s.charAt(right), right+1);
			//the duplicate character will be stored in map with new index.
		}
		return myAnswer;	
	}
}
