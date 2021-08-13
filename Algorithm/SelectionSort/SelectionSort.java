
import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
	
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter your Array Size");
		int arraySize = myScan.nextInt();
		int[] myArray = new int[arraySize];
		System.out.println("Enter your Array Element");
		for(int i = 0; i < arraySize; i++){
			myArray[i] = myScan.nextInt();
		}
		
		System.out.print("Your array is ");
		System.out.println(Arrays.toString(myArray));
		myScan.close();
		System.out.print("After sort: ");
		System.out.println(Arrays.toString(SelectionSortClass(myArray, arraySize)));
	}
	
	public static int[] SelectionSortClass(int[] myArray, int myArraySize){
		
		int temp;
		
		for(int i = 0; i < myArraySize; i++){
			for(int j = i+1; j < myArraySize; j++){
				if(myArray[i] > myArray[j]){
					temp = myArray[i];
					//If ith number is greater than jth number, save the number into temp variable.
					myArray[i] = myArray[j];
					//Put jth number to ith number
					myArray[j] = temp;
					//put temp variable into jth number
				}
			}
		}
		return myArray;//return array.
	}
}
