package LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		String s1;
		
		System.out.println("Enter your string");
		
		s1 = myScan.nextLine();
		
		//System.out.println(s1);
		
		Solution mySolution = new Solution();
		
		System.out.println(mySolution.lengthOfLongestSubstring(s1));
	}

}
