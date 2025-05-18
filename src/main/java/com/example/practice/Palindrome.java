package com.example.practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madamm";
		System.out.println(isPalindrome(str));
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
