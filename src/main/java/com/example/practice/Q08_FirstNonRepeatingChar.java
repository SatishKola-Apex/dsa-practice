package com.example.practice;

import java.util.*;

public class Q08_FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonRepeatingFirstChar("satish"));
	}
	
	public static char nonRepeatingFirstChar(String s) {
		if(s==null || s.isEmpty()) {
			return ' ';
		}
		
//		Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
		}
		
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			if(entry.getValue()==1) {
//				return entry.getKey();
//			}
//		}
		
		for (char c : s.toCharArray()) {
			if(frequencyMap.get(c)==1) {
				return c;
			}
		}
		return ' ';
	}

}
