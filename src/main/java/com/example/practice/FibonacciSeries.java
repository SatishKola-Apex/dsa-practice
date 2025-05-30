package com.example.practice;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(generateFibonacci(0)));
		
		generateFibonacci2(4);
	}

	private static void generateFibonacci2(int n) {
		// TODO Auto-generated method stub
		if(n<=0) {
			System.out.println(-1);
		}
		else {
			int first=0; int second=1; int sum=0;
			System.out.print(first+", "+second);
			for(int i=3; i<=n; i++) {
				sum = first+second;
				System.out.print(", "+ sum);
				first = second;
				second=sum;
			}
		}
	}

	private static int[] generateFibonacci(int num) {
		// TODO Auto-generated method stub
		if(num<=0) {
			return new int[0];
		}
		
		int[] fibonacci = new int[num];
		fibonacci[0] = 0;
		if(num==1) {
			return fibonacci;
		}
		fibonacci[1] = 1;
		for(int i=3; i<=num; i++) {
			fibonacci[i-1] = fibonacci[i-2]+fibonacci[i-3];
		}
		return fibonacci;
	}

}
