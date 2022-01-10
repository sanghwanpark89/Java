package IntegerToEnglishWords;

import java.util.*;

public class Solution {
	
	String result = "";
	//result will be blank string
		
	String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	//declare the string array for number of below twenty
	
	String[] belowHunered = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	//declare the string array for numbers below Hundred	
	
	public String numToWords(int num) {
		if(num == 0) {
		//if number is equal to zero,
			return "Zero";
			//return Zero as string
		}
		return numToWords2(num);
		//else call another method which is numToWords2
	}
	
	public String numToWords2(int num) {
		
		if(num < 20) {
		//if number is less than 20,
			result = belowTwenty[num];
			//the number will be sent to belowTwenty and then print the result 
		}
		
		else if(num < 100) {
		//if number is less than 100,
			result = belowHunered[num / 10] +" "+ belowTwenty[num % 10];
			//the number which is divided by 10 will be sent to belowHundred array and belowTwenty array
		}
		
		//From Here to last else statement
		else if(num < 1000) {
			result = numToWords2(num/100) + " Hundred " + numToWords2(num % 100);
		}
		
		else if(num < 1000000) {
			result = numToWords2(num/100) + " Thousand " + numToWords2(num % 100);
		}
		
		else if(num < 1000000000) {
			result = numToWords2(num/100) + " Million " + numToWords2(num % 100);
		}
		
		else {
			result = numToWords2(num/100) + " Billion " + numToWords2(num % 100);
		}
		//the same statement will be executed until we have the number
		
		return result.trim();
		//After we have result, we need to do trim
	}
}
