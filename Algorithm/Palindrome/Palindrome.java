
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter your Number");
		
		int inputNumber = myScan.nextInt();
		
		System.out.println(isPalindrome(inputNumber));		
	}
	
	public static boolean isPalindrome(int num){
		
		int myNum = num;
		
		if(num == 0){
			return true;
		}
		
		if( num < 0 || num %10 == 0){
			return false;
		}
		
		int reverseNumber = 0;
		while(myNum > 0){
			
			reverseNumber = reverseNumber*10 + (myNum%10);
			
			myNum = myNum / 10;
		}
		
		if(num == reverseNumber){
			System.out.println(reverseNumber);
			return true;
		}
		else{
			System.out.println(reverseNumber);
			return false;
		}
	}

}
