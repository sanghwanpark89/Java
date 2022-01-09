package BinarySearch;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Scanner instance
		
		System.out.println("Enter your array size");
		//Ask to user to provide array size
		
		int myArraySize = myScan.nextInt();
		//user will provide array size
		
		System.out.println("Enter your array");
		//Ask to user to provide array elements
		
		int[] myArray = new int[myArraySize];
		//user will provide array elements
		
		for(int i = 0; i < myArraySize; i++) {
		//numbers will be stored in array 
			myArray[i] = myScan.nextInt();
		}
		
		System.out.println("Enter your target number");
		//Ask to user to provide target number
		
		int myTarget = myScan.nextInt();
		//user will provide target number
		
		System.out.println("This is your array");
		//After this line the array will be showed
		
		System.out.println(Arrays.toString(myArray));
		//Print the array
		
		Solution mySolution = new Solution();
		//Declare the solution instance
		
		System.out.println(mySolution.binarySearch(myArray, myTarget));
		//call vinarysearch method and print the result
	}
}
