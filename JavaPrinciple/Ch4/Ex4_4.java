package Ch4;

import java.util.*;

public class Ex4_4 {

	public static void main(String[] args) {
		
//		int score = 0;	//variable to save the score
//		char grade = ' ';	//variable to save the Grade
//		
//		System.out.println("Enter you score");
//		Scanner myScan = new Scanner(System.in);
//		score = myScan.nextInt();
//		
//		if(score >= 90) {
//			grade = 'A';
//		}
//		else if(score >= 80) {
//			grade = 'B';
//		}
//		else if(score >= 70) {
//			grade = 'C';
//		}
//		else {
//			grade = 'D';
//		}
//		
//		System.out.println("Your score is " + grade +". ");

		
		int score = 0;	//variable to save the score
		char grade = 'D';	//variable to save the Grade
		
		System.out.println("Enter you score");
		Scanner myScan = new Scanner(System.in);
		score = myScan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		
		System.out.println("Your score is " + grade +". ");

	}

}
