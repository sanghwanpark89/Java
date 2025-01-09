package ch5;

import java.util.*;

public class Ex5_9_2DArray2 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {
			{100, 100, 100},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		};
		
		//Total score each subject
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("Number   Korean   English    Math   Total   Average");
		System.out.println("====================================================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal = korTotal + score[i][0];
			engTotal = engTotal + score[i][1];
			mathTotal = mathTotal + score[i][2];
			
			System.out.printf("%3d", i+1);
			
			for(int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
				System.out.printf("%7d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length;
			System.out.printf("%7d   %5.1f%n", sum, avg);
			
		}
		System.out.println("====================================================");
		System.out.printf("Total: %5d %5d %5d", korTotal, engTotal, mathTotal);
	}

}
