package MinimumDeletionsToMakeCharacterFrequenciesUnique;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create the scanner instance
		
		System.out.println("Enter your String");
		//Ask to user to provide the string
		
		String myString = myScan.nextLine();
		//myString will save the input from the user
		
		Solution mySolution = new Solution();
		//Create the solution instance
		
		System.out.println("Here is your answer");
		
		System.out.println(mySolution.minDeletions(myString));
		//Show the result
	}

}
