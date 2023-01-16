package Problems;

import java.util.Arrays;

public class Q1_Two_Sum {
	
	// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	 public static int[] twoSum(int[] nums, int target) {
		 int numsLength = nums.length;
		 for (int i=0; i<numsLength;i++) {
			 System.out.println("i: "+i);
			 
			 for (int j=0; j!=i && j<numsLength;j++) {
				 System.out.println("j: "+j);
				 if (nums[i]+nums[j] == target) {
					 if (i<j)
						 return new int[] {i,j};
					 return new int[] {j,i};
				 }
			 }
		 }
		 
		return new int[] {-1,-2};
	  }
	 
	 public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}
}
