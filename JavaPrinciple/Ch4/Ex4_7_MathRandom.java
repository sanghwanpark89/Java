package Ch4;

/*
 * print random number between 1 to 10
 * 
 * Math.random() method will return the number as double type, and range is 0.0 to 1.0
 * 
 * 0.0 <= Math.random() < 1
 * 
 * 1. so if you want to get the number between 1 to 10, should multiply 10 first
 * 2. change the double type to integer
 * 3. add 1 each side
 * 
 *
 */


import java.util.*;

public class Ex4_7_MathRandom {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(int i = 0; i < 10; i++) {
			num = (int)(Math.random()*10) + 1;
			System.out.println(num);
		}
		
		

	}

}
