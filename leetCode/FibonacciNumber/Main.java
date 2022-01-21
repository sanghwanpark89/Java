package FibonacciNumber;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int myNum = myScan.nextInt();
		
		Solution mySolution = new Solution();
		
		System.out.println(mySolution.fib(myNum));
	}
}
