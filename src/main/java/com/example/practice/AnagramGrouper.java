package com.example.practice;

import java.util.*;

public class AnagramGrouper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(GroupAnagrams(arr));
	}
	
	public static List<List<String>> GroupAnagrams(String[] arr) {
		if(arr==null || arr.length==0) {
			return new ArrayList<>();
		}
		
		Map<String, List<String>> map = new HashMap<>();
		for(String s:arr) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
			/*
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			List<String> arr2 = map.get(key);
			arr2.add(s);
			map.put(key, arr2);
			*/
		}
		return new ArrayList<>(map.values());
	}
}
