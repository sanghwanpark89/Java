package CanAttendMeeting;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create the scanner instance
		
		System.out.println("Enter your array row");
		//Ask to user to provide the row of array
		
		int myRow = myScan.nextInt();
		//myRow variable will have the row number 
		
		System.out.println("Enter your array column");
		//Ask to user to provide the row of column
		
		int myColumn = myScan.nextInt();
		//myColumn variable will have the column number
		
		int[][] myArray = new int[myRow][myColumn];
		//initialize the myArray with 2D array size
		
		System.out.println("Enter your 2D Array");
		
		for(int i = 0; i < myRow; i++) {
			for(int j = 0; j < myColumn; j++) {
				
				myArray[i][j] = myScan.nextInt();
				//myArray will have the number according to each element
						
			}
		}
		
		System.out.println("This is your 2D array");
		//Print 2D array
		
		System.out.println(Arrays.deepToString(myArray));
		//Print 2D array
		
		Solution mySolution  = new Solution();
		//Create the solution instance
		
		System.out.println(mySolution.canAttendMeetings(myArray));
		//call canAttendMeetings method and provide the myArray into the canAttendMeeting method
	}
}
