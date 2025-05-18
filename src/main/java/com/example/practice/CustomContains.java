package com.example.practice;

public class CustomContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word = "CODGE";
//		String target = "ODG";
//		System.out.println(isContains(word, target));
		
		String[] words = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
		longestWordContainingSubstring(words, toSearch);
	}
	
	private static void longestWordContainingSubstring(String[] words, String toSearch) {
		int longest = 0;
		String longestWord = "";
		for(String word:words) {
			if(isContains(word, toSearch) && word.length()>longest) {
				longest = word.length();
				longestWord = word;
			}
		}
		System.out.println("Longest word that contains the substring is : "+longestWord+" Length is : "+longest);
	}

	public static boolean isContains(String word, String target) {
		int wordLen = word.length();
		int targetLen = target.length();
		
		if(wordLen < targetLen) {
			return false;
		}
		
		for (int i=0; i<wordLen-targetLen; i++) {
			boolean matched = true;
			for(int j=0; j<targetLen; j++) {
				if(word.charAt(i+j)!=target.charAt(j)) {
					matched=false;
					break;
				}
			}
			if(matched) return true;
		}
		return false;
	}
}
