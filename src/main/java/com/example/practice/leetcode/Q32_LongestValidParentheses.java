package com.example.practice.leetcode;

import java.util.*;

public class Q32_LongestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParentheses(")()())"));
	}
	
	public static int longestValidParentheses(String str) {
		int maxLen=Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				stack.push(i);
			}
			else {
				stack.pop();
				if(stack.isEmpty()) {
					stack.push(i);
				}
				else {
					maxLen=Math.max(maxLen, i-stack.peek());
				}
			}
		}
		return maxLen;
	}
}
