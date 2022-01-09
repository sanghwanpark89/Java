package BinarySearch;

import java.util.*;

public class Solution {
	
	public int binarySearch(int nums[], int target) {
		
        
        int left = 0;
		//This is left pivot
		
		int right = nums.length-1;
		//This is right pivot
		
		int midPivot = 0;
		//This is middle pivot
        //It should be declared first from while loop 
		
		while(left <= right) {
        //while statement will be executed until left pivot is same with right pivot
			
            midPivot = left + ((right - left)/2);
            //midPivot is left + (right-left)/2
            
			if(nums[midPivot] == target) {
            //if number in array is same with target number,
				return midPivot;
                //it will return index number
			}
			
			else if(nums[midPivot] < target) {
            //if midnumber is less than target number
                
				left = midPivot + 1;
                //add one to midPivot on left pivot variable
			}
            
			else {
            //if nidnumber is greater than target number
                
				right = midPivot - 1;
                //substract one to midPivot on right pivot variable
			}
		}
		return -1;
        //if there is no answer, this method will return -1

	}

}
