package MinMeetingRooms;

import java.util.*;

public class Solution {

	public int minMeetingRooms(int[][] intervals) {
		
		if(intervals.length == 0) {
		//if length of intervals is 0,
			return -1;
			//it will return -1
		}
		
		int[] starts = new int[intervals.length];
		//create the starting points and length should be interval length
		
		int[] ends = new int[intervals.length];
		//create the ending points and length should be interval length
		
		for(int i = 0; i < intervals.length; i++) {
			
			
 			/*  0     1
			 * [0  , 30]
			 * [5  , 10]
			 * [10 , 15]
			 * 
			 * Above array is example array
			 */
			
			starts[i] = intervals[i][0];
			
			ends[i] = intervals[i][1];
			
		}
		
		Arrays.sort(starts);
		//sort the array
		Arrays.sort(ends);
		//sort the array 
		
		int rooms = 0;
		//initialize the room
		
		int endI = 0;
		//initialize the ending index
		
		for(int i = 0; i < intervals.length; i++) {
		//for loop will be executed until intervals.length
			
			if(starts[i] < ends[endI]) {
			//if starts is less than end array
				rooms++;
				//rooms number will be increased
			}
			else {
				endI++;
				//if not endI will be increased
			}
		}
		return rooms;
	}
}
