package com.example.practice;

public class PalindromeFromCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "racecar";
		System.out.println(expandFromCenter(input));
	}
	
	public static boolean expandFromCenter(String input) {
		
		int left, right=0;
		if(input.length()%2==0) {
			right=input.length()/2;
			left=right-1;
		}
		else {
			left=right=input.length()/2;
		}
		
		while(left>=0 && right<input.length()) {
			if(input.charAt(left)==input.charAt(right)) {
				left--;
				right++;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
