package ValidParentheses;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create scanner intance
		
		System.out.println("Enter your string");
		//Ask to user to provide the string
		
		String myString = myScan.nextLine();
		//scanner will save the string into myString variable
		
		Solution mySolution = new Solution();
		//call solution instance
		
		System.out.println(mySolution.isValid(myString));
		//pass the mystring into isValid method
	}

}
