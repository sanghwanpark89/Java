package TwoSum;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create the scanner instance.

		System.out.println("Enter your array size");
		//Ask to user that size of array user wants to make.
		
		int myArraySize = 0;
		//Initialize the array size.
		
		myArraySize = myScan.nextInt();
		//User will provide the size of array, and scanner will save the numbers into myArraySize variable.
		
		int[] myArray = new int[myArraySize];
		//Declare the array with array size.
		
		System.out.println("Enter your array");
		//Ask to user to provide array.
		
		for(int i = 0; i < myArraySize; i++) {
			myArray[i] = myScan.nextInt();
		}
		//for loop will save the array element and make the array.
		
		System.out.println("Enter your target number");
		//Ask to user to provide target number.
		
		int myTarget = myScan.nextInt();
		//Scanner will save the target number into myTarget variable.
		
		System.out.println(Arrays.toString(myArray));
		//If you want to print array, you need to Arrays.toString() method to print out the array.
		
		TwoSum myTwoSum = new TwoSum();
		//create the TwoSum object and the address will be saved into myTwoSum.
		
		System.out.println(Arrays.toString(myTwoSum.twoSum(myArray, myTarget)));
		//This line will send the value of array and target number to Two Sum class then will print out the result.

	}

}
