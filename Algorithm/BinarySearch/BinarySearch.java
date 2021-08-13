
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter your array size");
		//ASK Array Size to User
		int arraySize = myScan.nextInt();
		//User will enter array size
		int[] myArray = new int[arraySize];
		//Create array
		System.out.println("Enter your array element");
		for(int i = 0; i < arraySize; i++){
			myArray[i] = myScan.nextInt();
		}
		//User will enter array element

		System.out.println("Enter your target number");
		
		int target = myScan.nextInt();
		//User needs to enter target number to have index number
		
		System.out.println(Arrays.toString(myArray));
		//Eclipse will print array
		
		System.out.println(binarySearch(myArray, target));
		//This line will send info of array and target number
		
	}
	
	public static int binarySearch(int[] inputArray, int target){
		
		if(inputArray.length == 0){
			return -1;
		}
		
		//if array length is equal to 0, program will be terminate automatically.
		
		int s = 0;
		//Starting point is 0 of Array
		int e = inputArray.length - 1;
		//Ending point is array length - 1

		while(s <= e){
			//if starting point is less than equal to ending point, program will be executed till starting point is equal to ending point
			
			int m =((s+e)/2);
			// mid point is starting point - eding point

			if(inputArray[m] == target){
				return m;
				//if target number is equal to input of Array, it will return index number of array
			}
			else if(target < inputArray[m]){
				e = m-1;
				//if target is less than mid of array, ending point will be changed as m-1
			}
			else{
				s = m+1;
				//if target is greater than mid of array, starting point will be changed as m+1 since array index start with 0.
			}
		}
		
//		for(int i = 0; i < inputArray.length; i++){
//			int m =((s+e)/2);
//			if(inputArray[i] == target){
//				return i;
//			}
//			else if(target < inputArray[m]){
//				e = m - 1;
//			}
//			else{
//				s = m + 1;
//			}
//		}
		//we can use for loop. please refer it if you need.
		
		return -1;
		
		//this program will return -1, if target number is not in the array.
	}

}
