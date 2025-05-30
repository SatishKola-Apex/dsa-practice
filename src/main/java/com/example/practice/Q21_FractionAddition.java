package com.example.practice;

public class Q21_FractionAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int denom1 = 3;
		int num2 = 3;
		int denom2 = 9;
		
		addFraction(num1, denom1, num2, denom2);
	}

	private static void addFraction(int num1, int denom1, int num2, int denom2) {
		// TODO Auto-generated method stub
		int numerator = num1*denom2 + num2*denom1;
		int denominator = denom1*denom2;
		
		int gcd = findGCD(numerator, denominator);
		System.out.println(numerator/gcd +"/"+ denominator/gcd);
		if(denominator/gcd ==1) {
			System.out.println();
			System.out.println(numerator/gcd);
		}
	}

//	private static int findGCD(int a, int b) {
//		// TODO Auto-generated method stub
//		return b==0?a:findGCD(b,a%b);
//	}
	
	private static int findGCD(int a, int b) {
		// TODO Auto-generated method stub
		int num = a>b?b:a;
		int gcd = 1;
		for(int i=1; i<=num; i++) {
			if(a%i ==0 && b%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}

}
