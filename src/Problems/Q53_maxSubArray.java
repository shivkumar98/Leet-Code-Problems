package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Q53_maxSubArray {


	public static int maxSubArray(int[] nums) {
	
		int subsum = 0, sum = nums[0];
		
		for (int i =0; i<nums.length; i++) {
			int x=nums[i];
			subsum+=x;
			if (subsum<0) {
				subsum = 0;
			} 
				sum=Math.max(sum, subsum);
		}
		
			return sum;
		
	}
	
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
		System.out.println(maxSubArray(new int[] { 1 }));
		System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
	}

}
