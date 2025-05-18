package com.example.practice;

import java.util.*;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		System.out.println(reverseVowels("asedifoguh"));
	}
	
	public static String reverseVowels(String str) {
		String vowels = "aeiouAEIOU";
		StringBuilder result=new StringBuilder(str);
		Stack<Character> stack = new Stack<>();
		for(char c:str.toCharArray()) {
			if(vowels.contains(String.valueOf(c))) {
				stack.push(c);
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			if(vowels.contains(String.valueOf(str.charAt(i)))) {
				result.replace(i, i+1, String.valueOf(stack.pop()));
			}
		}
		return result.toString();
	}
}
