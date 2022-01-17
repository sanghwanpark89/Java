package LongestCommonPrefix;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create the scanner instance
		
		System.out.println("Enter your array size");
		//Ask to user to provide the array size
		
		int myNum = myScan.nextInt();
		//myNum variable will have array size
		
		String[] myArray = new String[myNum];
		//Create the array and array size will be the myNum
		
		System.out.println("Enter your string");
		//Ask to user to provide the array with string
		
		for(int i = 0; i < myNum; i++) {
		//for loop will be executed and save the string
			
			myArray[i] = myScan.next();
			//Array will save the string element from scanner
		}
		
		System.out.println(Arrays.toString(myArray));
		//Print the array
		
		Solution mySolution = new Solution();
		//Create the solution 
		
		System.out.print("This is common prefix : ");
		//It will print out
		System.out.println(mySolution.longestCommonPrefix(myArray));
		//print out the longest common prefix
		
	}
}
