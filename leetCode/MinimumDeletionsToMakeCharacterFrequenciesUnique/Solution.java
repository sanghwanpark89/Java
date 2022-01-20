package MinimumDeletionsToMakeCharacterFrequenciesUnique;

import java.util.*;

public class Solution {
	
	public int minDeletions(String s) {
		
		int[] myFreq = new int[26];
		//Create frequency array which size should be 26 for number of alphabet.
		
		Set<Integer> mySet = new HashSet<>();
		//Create the Set
		
		for(int i = 0; i < s.length(); i++) {
		//for loop will be executed until i meet string length
			myFreq[s.charAt(i) - 'a']++;
			

			/*
			 * if character is a, s.charAt(i) will have the number 97 according to ASCII.
			 * so freq[0]++ will be executed like this.
			 * 
			 */
		}
		
		System.out.println(Arrays.toString(myFreq));
		
		//System.out.println(mySet);
		
		int numOfDelete = 0;
		//initialize the number of Deletion.
		
		int currentFreq = 0;
		//initialize the currentFrequency
		
		for(int i = 0; i < myFreq.length; i++) {
		//for loop will be executed
			
			if(!mySet.contains(myFreq[i])) {
			//if set does not have frequency,
				
				mySet.add(myFreq[i]);
				//it will add to set
				
				continue;
				//it will not execute rest of code below and go to for loop again.
				
			}
			
			currentFreq = myFreq[i];
			//current frequency will be saved into currentFreq variable.
			
			while(currentFreq > 0) {
			//if there is same number of frequency,
			//while loop will be executed if currentFrequency is greater than 0
				
				numOfDelete++;
				//number of delete increased by 1
				
				currentFreq--;
				//number of current frequency is decreased by 1
				
				if(currentFreq != 0 && mySet.add(currentFreq)) {
				//if current frequency is not equal to zero and current frequency is add to myset,
					break;
					//it will exit while loop
				}
			}
		}
		return numOfDelete;
		//it will return number of delete
		
//		for(int i = 0; i < freq.length; i++) {
//		//for loop will be executed until frequency array length
//			
//			currentFreq = freq[i];
//			//number of frequency will be saved in currentFreq variable.
//			
//			while(currentFreq > 0) {
//			//if currentFreq variable is greater than 0, this loop will be executed
//				
//				if(mySet.contains(currentFreq)) {
//				//if set has currentFreq
//					
//					currentFreq--;
//					
//					numOfDelete++;
//					
//				}
//				else {
//					break;
//				}
//			}
//			if(currentFreq != 0) {
//				mySet.add(currentFreq);
//			}
//		}
//		return numOfDelete;
	}

}
