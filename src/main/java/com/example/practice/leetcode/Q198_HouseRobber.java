package com.example.practice.leetcode;

public class Q198_HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1};
		int robbedAmount = robHouse(arr);
		if(robbedAmount>0) {
			System.out.println("The robbed amount is : "+robbedAmount);
		}
		else {
			System.out.println("No amount is robbed");
		}
	}

	private static int robHouse(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length == 0) {
			return -1;
		}
		if(arr.length==1) {
			return arr[0];
		}
		
		int[] robbed = new int[arr.length];
		robbed[0]=arr[0];
		robbed[1]=Math.max(arr[0], arr[1]);
		
		for(int i=2; i<arr.length; i++) {
			robbed[i] = Math.max(robbed[i-1], robbed[i-2]+arr[i]);
		}
		return robbed[arr.length-1];
	}

}
