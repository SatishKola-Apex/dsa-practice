package com.example.practice;

import java.util.*;

public class CharacterCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countChars("aaabbccccabbbbb");
	}

	public static void countChars(String input) {
		Map<Character, Integer> freqMap = new HashMap<>();
		StringBuilder result = new StringBuilder();
		for(char c:input.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:freqMap.entrySet()) {
			result.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(result);
//		System.out.println(freqMap);
	}
}
