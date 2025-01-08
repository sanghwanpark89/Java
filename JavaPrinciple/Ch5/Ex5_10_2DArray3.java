package ch5;

import java.util.*;

public class Ex5_10_2DArray3 {

	public static void main(String[] args) {
		
		String [][] words = new String[][]{{"chair", "의자"},{"compueter", "컴퓨터"},{"integer", "정수 "}};
		
		Scanner myScan = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d: what is the definition of %s", i+1, words[i][0]);
			
			String temp = myScan.nextLine().trim();
			if(temp.equals(words[i][1])) {
				System.out.printf("Correct%n%n");
			}
			else {
				System.out.printf("Wrong. The answer is %s.%n", words[i][1]);
			}
		}
	}

}
