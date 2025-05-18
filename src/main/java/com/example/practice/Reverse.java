package com.example.practice;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hello";
		int[] arr= {1,2,3,4,5,6,7};
		reverseString(str, 0, str.length()-1);
//		reverseString2(str);
//		reverseArray(arr, 0, arr.length-1);
	}
	
	public static void reverseString(String str, int start, int end) {
		char[] chars = str.toCharArray();
		while(start < end) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(chars));
		
		String reversedStr = new String(chars);
		System.out.println(reversedStr);
	}
	
	public static void reverseString2(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
	
	public static void reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
