package Ch4;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("Enter your score");
		
		Scanner myScan = new Scanner(System.in);
		score = myScan.nextInt();
		
		System.out.printf("Your score %d.%n", score);
		
		if(score >=90) {
			grade ='A';
			if(score >= 98) {
				opt = '+';
			}
			else if(score < 94) {
				opt ='-';
			}
		}
		
		else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}
			else if(score < 84) {
				opt = '-';
			}
		}
		
		else {
			grade = 'C';
		}
		
		System.out.printf("Your grade is %c%c.%n", grade, opt);

	}

}
