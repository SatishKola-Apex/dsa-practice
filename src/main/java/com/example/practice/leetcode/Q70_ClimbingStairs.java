package com.example.practice.leetcode;

public class Q70_ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stairNum = 5;
		int numOfSteps = climbStairs(stairNum);
		System.out.println(numOfSteps);
	}

	private static int climbStairs(int stairNum) {
		// TODO Auto-generated method stub
		if(stairNum<=2) {
			return stairNum;
		}
		int step1 = 1;
		int step2 = 2;
		int currentStair = 0;
		for(int i=3; i<=stairNum; i++) {
			currentStair = step1+step2;
			step1 = step2;
			step2 = currentStair;
		}
		return currentStair;
	}

}
