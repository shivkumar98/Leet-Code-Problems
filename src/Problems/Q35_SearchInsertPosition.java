package Problems;

import java.util.Arrays;

public class Q35_SearchInsertPosition {

	/*
	 * Given a sorted array of distinct integers and a target value,
	 *  return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	 *  You must write an algorithm with O(log n) runtime complexity.
	 */
	
	 public static int searchInsert(int[] nums, int target) {
		 int x = (Arrays.binarySearch(nums, target));
		 if (x==-1) {
			 return 0;
		 } else if (x<0) return -x-1;
		 else return x;
	         
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
		
	}
}
