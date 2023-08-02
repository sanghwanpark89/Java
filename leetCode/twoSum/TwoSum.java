package TwoSum;

import java.util.*;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if((nums[i] + nums[j])==target)
					return new int[] {i,j};	//this will return new array of result
			}
		}
		//We need two for loop to check the sum of the each element will meet target number
		//if the sum of the each element is meet target number, it will return the array with 

		return null;
		//if there is no result, this method will return null value.
	}
}
