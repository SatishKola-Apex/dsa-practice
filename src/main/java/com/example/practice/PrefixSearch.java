package com.example.practice;

public class PrefixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"apple", "applet", "bread", "aper"};
	    String prefix = "app";
	    prefixSearch(words, prefix);
	}
	
	public static void prefixSearch(String[] words, String prefix) {
		int prefixLen = prefix.length();
		for(String word:words) {
//			if(word.substring(0, prefixLen).equals(prefix)) {
//				System.out.println(word);
//			}
			if(customPrefix(word, prefix)) {
				System.out.println(word);
			}
		}
	}

	public static boolean customPrefix(String word, String target) {
		int targetLen = target.length();
		boolean isSubtring = true;
		
		for(int i=0; i<targetLen; i++) {
			if(word.charAt(i)!=target.charAt(i)) {
				isSubtring = false;
				break;
			}
		}
		return isSubtring;
	}
}
