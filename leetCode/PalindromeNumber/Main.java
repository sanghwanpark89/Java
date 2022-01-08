package PalindromeNumber;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Scanner instance
		
		System.out.println("Enter your String or Number");
		
		String myString = myScan.nextLine();
		
		Solution mySolution = new Solution();
		
		System.out.println(mySolution.isPalindrome(myString));
		
		if(mySolution.isPalindrome(myString)) {
			System.out.println("Given input is palindrome");
		}
		else {
			System.out.println("Given input is not palindrome");
		}
		
	}

}
