package Ch4;

import java.util.*;

public class Ex4_15_doWhile {

	public static void main(String[] args) {
		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100) + 1;
		System.out.println(answer); 

		Scanner myScan = new Scanner(System.in);
		
		do {
			System.out.print("Enter your number between 1 and 100");
			input = myScan.nextInt();
			if(input > answer) {
				System.out.println("it should be less than number you entered");
			}
			else if(input < answer) {
				System.out.println("it should be greater than number you entered");
			}
		}
		while(input != answer);
		
		System.out.println("You got answer");

	}

}
