package Ch4;

import java.util.*;

public class Ex4_6_Switch {

	public static void main(String[] args) {
		
		System.out.println("Enter your month");
		
		Scanner myScan = new Scanner(System.in);
		int month = myScan.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("It is spring");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.println("It is summer");
				break;
			case 9: case 10: case 11:
				System.out.println("It is fall");
				break;
			default:
//			case 12: case 1: case 2:
				System.out.println("It is winter");
		}

	}

}
