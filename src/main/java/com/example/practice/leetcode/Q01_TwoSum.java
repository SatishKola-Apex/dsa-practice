package com.example.practice.leetcode;

import java.util.*;

public class Q01_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 17;
		int[] result = sumAnyIndex(nums, target);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] sumAnyIndex(int[] nums, int target) {
		if(nums==null || nums.length==0) {
			return new int[0];
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	public static int[] sum(int[] nums, int target) {
		if(nums==null || nums.length==0) {
			return new int[0];
		}
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]+nums[i]==target) {
				return new int[] {i-1, i};
			}
		}
		return null;
	}

}
