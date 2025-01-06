package Ch4;

import java.util.*;

public class Ex4_3 {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner myScan = new Scanner(System.in);
		
		int input = myScan.nextInt();
		
		if(input ==0) {
			System.out.println("Your number is 0");
		}
		else {
			System.out.println("Your number is not 0");
		}

	}

}
