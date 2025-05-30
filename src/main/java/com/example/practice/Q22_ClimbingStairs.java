package com.example.practice;

public class Q22_ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		System.out.println(climbStairs1(num));
		climbStairs2(num);
	}

	private static int climbStairs2(int num) {
		// TODO Auto-generated method stub
		if(num<=2) {
			return num;
		}
		int firstStep=1, secondStep=2, current=0;
		for(int i=3; i<=num;i++) {
			current=firstStep+secondStep;
			firstStep = secondStep;
			secondStep = current;
		}
		return current;
	}

	private static int climbStairs1(int num) {
		// TODO Auto-generated method stub
		if(num==0 || num==1) {
			return 1;
		}
		int[] arr = new int[num+1];
		arr[0] = arr[1] = 1;
		for(int i=2; i<=num; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[num];
	}

}
