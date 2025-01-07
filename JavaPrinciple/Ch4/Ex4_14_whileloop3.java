package Ch4;

import java.util.*;

public class Ex4_14_whileloop3 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		System.out.println("Enter your number, Ex)12345 ");
		
		Scanner myScan = new Scanner(System.in);
		
		String temp = myScan.nextLine();
		num = Integer.parseInt(temp);
		
		while(num != 0) {
			sum = sum + (num%10);
			System.out.printf("sum = %3d num = %d%n", sum, num);
			
			num = num/10;
		}
		
		System.out.println("Your sum is " + sum);

		System.out.println("ENter your number again");
		
		temp = myScan.nextLine();
		num = Integer.parseInt(temp);
		sum = 0;
		
		
		for(int i = 1; i <= temp.length(); i++) {
			
			sum = sum + (num%10);
			System.out.printf("Stage: %d, sum = %d, num = %d%n", i, sum, num);
			num = num/10;
		}
		
		
		
		
	}

}
