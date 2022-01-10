package IntegerToEnglishWords;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create Scanner instance
		
		System.out.println("Enter your number");
		//Ask to user to provide the input
		
		int myNum = myScan.nextInt();
		//Scanner will save the input from user into myNum variable
		
		Solution mySolution  = new Solution();
		//Create Solution intance
		
		System.out.println(mySolution.numToWords(myNum));
		//call numToWords method and pass the myNum variable into method
	}

}
