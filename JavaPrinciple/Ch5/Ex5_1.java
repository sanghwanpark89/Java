package ch5;

import java.util.*;

public class Ex5_1 {

	public static void main(String[] args) {
		
		int[] Array1 = new int[10];
		int[] Array2 = new int[10];
//		int[] Array3 = new int[] {100,95,80,70,60};
		int[] Array3 = {100,95,80,70,60};
		char[] chArray = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < Array3.length; i++) {
			System.out.printf("This is array elements Array3[%d], [%d]%n", i, Array3[i]);
		}
		
		for(int i = 0; i < Array1.length; i++) {
			Array1[i] = (int)(Math.random()*10)+1;
		}
		
		System.out.println(Arrays.toString(Array1));
		
		for(int i = 0; i < Array1.length; i++) {
			System.out.printf("Element of array[%d] is %d%n", i, Array1[i]);
		}
		
		System.out.println(Array1);
		System.out.println(Array2);
		System.out.println(Array3);
		System.out.println(chArray);
		//character array will print abcd without any delimiter.
		
	}

}
