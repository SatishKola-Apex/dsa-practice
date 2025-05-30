package com.example.practice;

import java.util.*;

public class Q19_FractionConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 50;
		int denominator = 22;
//		System.out.println(convertFraction(numerator, denominator));
		System.out.println(handleRepeatingQuotient(numerator, denominator));
	}
	
	

	private static String handleRepeatingQuotient(int num, int denom) {
		// TODO Auto-generated method stub
		if(num==0) {
			return "0";
		}
		StringBuilder result = new StringBuilder();
		result.append(num/denom);
		int remainder = num%denom;
		if(remainder==0) {
			return result.toString();
		}
		
		result.append(".");
		
		Map<Integer, Integer> remTracker = new HashMap<>();
		while(remainder!=0) {
			if(remTracker.containsKey(remainder)) {
				int indexFirsOccurrence = remTracker.get(remainder); //Index of first occurrence of remainder
				result.insert(indexFirsOccurrence, "("); //Inserts element at given index and moves element present at that index to right side
				result.append(")");
				break;
			}
			remTracker.put(remainder, result.length());
			remainder*=10;
			result.append(remainder/denom);
			remainder%=denom;
		}
		return result.toString();
	}



	private static String convertFraction(int numerator, int denominator) {
		// TODO Auto-generated method stub
		if(numerator==0) {
			return "0";
		}
		
		StringBuilder result = new StringBuilder();
		result.append(numerator/denominator);
		int remainder = numerator%denominator;
		if(remainder==0) {
			return result.toString();
		}
		
		result.append(".");
		int i=1;
		while(remainder!=0 && i<=5) {
			remainder *= 10;
            result.append(remainder / denominator);
            remainder %= denominator;
		}
		return result.toString();
	}



	private static String convertFraction2(int numerator, int denominator) {
		// TODO Auto-generated method stub
		if(numerator==0) {
			return "0";
		}
		StringBuilder result = new StringBuilder();
//		if(numerator<0 ^ denominator<0) {
//			result.append("-");
//		}
		
		double quotient = (double) numerator/denominator;
		result.append(quotient);
//		int remainder = numerator%denominator;
//		if(remainder==0) {
//			return result.toString();
//		}
		
		return result.toString();
	}

}
