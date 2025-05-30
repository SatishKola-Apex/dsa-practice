package com.example.practice;

public class Q33_RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3, 0, 2, 0, 4};
		trapRainWater(input);
	}

	public static void trapRainWater(int[] input) {
		int left = 0;
		int right = input.length-1;
		int leftMax = 0, rightMax=0;
		int amountOfWater = 0;
		
		while(left<right) {
			if(input[left]<input[right]) {
				if(input[left]>=leftMax) {
					leftMax=input[left];
				}
				else {
					amountOfWater = amountOfWater + leftMax-input[left];
				}
				left++;
			}
			else {
				if(input[right]>=rightMax) {
					rightMax=input[right];
				}
				else {
					amountOfWater = amountOfWater + rightMax-input[right];
				}
				right--;
			}
		}
		System.out.println(amountOfWater);
	}
}
