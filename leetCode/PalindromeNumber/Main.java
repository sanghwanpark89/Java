package PalindromeNumber;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Scanner instance
		
		System.out.println("Enter your String or Number");
		//Ask to user to provide the input
		
		String myString = myScan.nextLine();
		//myString variable will save the value from the user
		
		Solution mySolution = new Solution();
		//call the instance
		
		System.out.println(mySolution.isPalindrome(myString));
		//print the result
		
		if(mySolution.isPalindrome(myString)) {
			System.out.println("Given input is palindrome");
			//if input is palindrome, it will print above
		}
		else {
			System.out.println("Given input is not palindrome");
			//if input is not palindrome, it will print above
		}
		
	}

}
