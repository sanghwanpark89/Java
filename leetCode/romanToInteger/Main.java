package RomanToInteger;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		//Scanner instance
		
		System.out.println("Enter your Roman number");
		//Ask to user to provide roman number
		
		String myRoman = myScan.nextLine();
		//myRoman string will be saved myRoman variable
		
		Solution mySolution  = new Solution();
		//Create the solution instance
		
		System.out.println(mySolution.romanToInt(myRoman));
		//Result will show up.
	}
}
