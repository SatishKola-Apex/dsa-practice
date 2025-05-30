package com.example.practice;

public class Q02_LongestWordContainingTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
		longestWordContainingTarget(dict,toSearch);
	}
	
	public static void longestWordContainingTarget(String[] words, String target) {
		int longestLength = 0;
		String longestWord = "";
		for(String word: words) {
			if(word.length()>longestLength && customContains(word, target)) {
				longestLength = word.length();
				longestWord = word;
			}
		}
		if(longestLength>0) {
			System.out.println("Longest word : "+longestWord+" and length is : "+longestLength);
		}
		else {
			System.out.println("No word found");
		}
	}
	
	public static boolean customContains(String word, String target) {
		int wordLen = word.length();
		int targetLen = target.length();
		
		if(wordLen<targetLen) {
			return false;
		}
		
		for(int i=0; i<wordLen-targetLen+1; i++) {
			boolean contains = true;
			for(int j=0; j<targetLen; j++) {
				if(target.charAt(j)!=word.charAt(i+j)) {
					contains = false;
					break;
				}
			}
			if(contains) return true;
		}
		return false;
	}
}
