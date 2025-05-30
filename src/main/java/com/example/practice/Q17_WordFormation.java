package com.example.practice;

import java.util.*;

public class Q17_WordFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input = "abcd";
        List<String> result = new ArrayList<>();
        for(String word:arr) {
        	if(isMatch(word, input)) {
        		result.add(word);
        	}
        }
        System.out.println(result);
	}
	
	public static boolean isMatch(String word, String target) {
		Map<Character, Integer> wordMap = new HashMap<>();
		for(char c:word.toCharArray()) {
			wordMap.put(c, wordMap.getOrDefault(c, 0)+1);
		}
		
		for(char c: target.toCharArray()) {
			if(!wordMap.containsKey(c)) {
				return false;
			}
			wordMap.put(c, wordMap.get(c)-1);
			if(wordMap.get(c)<0) {
				return false;
			}
		}
		return true;
	}
}
