package com.example.practice;

public class CustomPrefixCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPrefix("apple","app")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public static boolean isPrefix(String word, String target) {
		if(word==null || word.isEmpty() || target==null || target.isEmpty()) {
			return false;
		}
		boolean isPrefix = true;
		for(int i=0; i<target.length(); i++) {
			if(word.charAt(i)!=target.charAt(i)) {
				isPrefix = false;
				break;
//				return false;
			}
		}
		return isPrefix;
	}
}
