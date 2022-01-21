package FibonacciNumber;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create the scanner instance
		
		System.out.println("Enter your number");
		//Ask to user to provide the number
		
		int myNum = myScan.nextInt();
		//myNum will be have number which is from user
		
		Solution mySolution = new Solution();
		//Create the solution instance
		
		System.out.println(mySolution.fib(myNum));
		//print fibanocci number
	}

}
