package com.example.practice.leetcode;

public class Q09_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int num) {
		if(num<0) {
//			num*=-1;
			return false;
		}
		
		int reversed = 0;
		int original = num;
		
		while(num!=0) {
			reversed = reversed*10 + num%10;
			num=num/10;
		}
		
		return original==reversed;
	}
	
	public static boolean isPalindrome2(int num) {
		String strNum = Integer.toString(num);
		for(int i=0; i<strNum.length(); i++) {
			if(strNum.charAt(i)!=strNum.charAt(strNum.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
