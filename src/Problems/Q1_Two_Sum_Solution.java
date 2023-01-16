package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_Two_Sum_Solution {
	
	// brute force approach:
	static int[] twoSum1(int[] nums, int target) {
		for (int i=0;i<nums.length;i++) {
			System.out.println("i: "+i);
			for (int j =0;j<nums.length; j++) {
				System.out.println("j: "+j);
				if (nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
			
		}
		return new int[] {};
	}
	
	// optimised code:
	static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> numToIndex = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum1(nums, target)));

	}
}
