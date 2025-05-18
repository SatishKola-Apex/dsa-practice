package com.example.practice;

public class LongetPossiblePalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromeSubstring("ABAABADAB"));
	}
	
	public static String palindromeSubstring(String str) {
		String longestPalindrome = "";
		for(int i=0; i<str.length(); i++) {
			String oddPalindrome = expandFromCenter(str, i, i);
			if(oddPalindrome.length()>longestPalindrome.length()) {
				longestPalindrome=oddPalindrome;
			}
			String evenPalindrome = expandFromCenter(str, i, i+1);
			if(evenPalindrome.length()>longestPalindrome.length()) {
				longestPalindrome=evenPalindrome;
			}
		}
		return longestPalindrome;
	}
	
	public static String expandFromCenter(String s, int left, int right) {
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}
}
