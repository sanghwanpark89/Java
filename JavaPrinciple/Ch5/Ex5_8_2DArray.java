package ch5;
import java.util.*;

public class Ex5_8_2DArray {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
//		int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
//		it is same with line number 8;
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				
				sum = sum + score[i][j];
			}
		}
		
		System.out.printf("Sum = %d", sum);
		
		
	}

}
