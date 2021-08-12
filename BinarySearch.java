
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter your array size");
		int arraySize = myScan.nextInt();
		int[] myArray = new int[arraySize];

		System.out.println("Enter your array element");
		
		for(int i = 0; i < arraySize; i++){
			myArray[i] = myScan.nextInt();
		}
		
		System.out.println("Enter your target number");
		
		int target = myScan.nextInt();
		
		System.out.println(Arrays.toString(myArray));
		
		
		System.out.println(binarySearch(myArray, target));
		
	}
	
	public static int binarySearch(int[] inputArray, int target){
		
		if(inputArray.length == 0){
			return -1;
		}
		
		int s = 0;
		int e = inputArray.length - 1;

//		while(s <= e){
//			int m =((s+e)/2);
//
//			if(inputArray[m] == target){
//				return m;
//			}
//			else if(target < inputArray[m]){
//				e = m-1;
//			}
//			else{
//				s = m+1;
//			}
//		}
		
		for(int i = 0; i < inputArray.length; i++){
			int m =((s+e)/2);
			if(inputArray[i] == target){
				return i;
			}
			else if(target < inputArray[m]){
				e = m - 1;
			}
			else{
				s = m + 1;
			}
		}
		return -1;
	}

}
