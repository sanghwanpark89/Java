package RomanToInteger;

import java.util.*;

public class Solution {
	
	public int romanToInt(String s) {
		
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		//Create the Map Key is Character and Value is Integer
		
		myMap.put('I' , 1);
		myMap.put('V' , 5);
		myMap.put('X' , 10);
		myMap.put('L' , 50);
		myMap.put('C' , 100);
		myMap.put('D' , 500);
		myMap.put('M' , 1000);
		
		//Put the Key and Value into map
		
		int length = s.length();
		//length is string length
		
		int result = myMap.get(s.charAt(length-1));
		//initial result is start with length - 1
		
		for(int i  = length-2; i >= 0; i--) {
		//this one should will start 2nd character form right and for statement will be executed
			
			if(myMap.get(s.charAt(i)) >= myMap.get(s.charAt(i+1))) {
			//compare two character, if left is greater than right, it will add together
				result = result + myMap.get(s.charAt(i));
			}
			
			else {
			//if left is less than right, it will substract
				result = result - myMap.get(s.charAt(i));
			}
		}
		return result;
		//return result
	}
}
