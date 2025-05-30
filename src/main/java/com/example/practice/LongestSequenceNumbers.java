package com.example.practice;

import java.util.*;

public class LongestSequenceNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(arr));
	}
	
	public static int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }

        int longestSequence = Integer.MIN_VALUE;
        for(int num: numSet){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int count =1;
                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longestSequence = Math.max(longestSequence, count);
            }
        }
        return longestSequence;
    }
}
