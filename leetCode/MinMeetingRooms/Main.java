package MinMeetingRooms;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		//Create scanner instance
		
		System.out.println("Enter your array row size");
		//Ask to user to input the array of row size
		
		int myRow = myScan.nextInt();
		//myRow will save the row number
		
		System.out.println("Enter your array column size");
		//Ask to user to input the array of the column size
		
		int myColumn = myScan.nextInt();
		//myColumn will save the column number
		
		System.out.println("Enter your 2D Array");
		//Ask to user to input the 2D array
		
		int[][] myArray = new int[myRow][myColumn];
		//Define the 2D array with myRow and myColumn
		
		for(int i = 0; i < myRow; i++) {
			for(int j = 0; j < myColumn; j++) {
				myArray[i][j] = myScan.nextInt();
				//scanner will receive the number from user and save the number into the 2D array
			}
		}
		
		System.out.println("Here is your 2D Array");
		
		System.out.println(Arrays.deepToString(myArray));
		//It will print out 2D array
		
		Solution mySolution = new Solution();
		//Create the solution instance
		
		System.out.println(mySolution.minMeetingRooms(myArray));
		//Print the result of minMeetingRooms.
	}

}
