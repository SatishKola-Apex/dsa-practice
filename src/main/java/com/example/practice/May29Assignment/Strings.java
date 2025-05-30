package com.example.practice.May29Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Peach", "Apricot", "Berry");
		System.out.println("Words start with A are : "+wordsStartWithA(words));
		System.out.println("Words in upper case are : "+toUpper(words));
		System.out.println("Words grouped by length are : "+groupByLength(words));
		System.out.println("first word with 5 chars is : "+firstWordWith5Chars(words));
		
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("apple", "banana"),
				Arrays.asList("cherry", "date"),
				Arrays.asList("kiwi", "lemon"));
		System.out.println("Flattened result is : "+flat(listOfLists));
		
		System.out.println("Concatenated result is : "+concat(words));
	}

	public static List<String> wordsStartWithA(List<String> words){
		return words.stream().filter(w -> w.charAt(0)=='A').toList();
	}
	
	private static List<String> toUpper(List<String> words) {
		return words.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
	}
	
	public static String concat(List<String> words) {
//		return words.stream().reduce((s1, s2) -> s1.concat(" "+s2)).orElse("");
		return words.stream().collect(Collectors.joining(" "));
	}
	
	public static Map<Integer, List<String>> groupByLength(List<String> words) {
		return words.stream().collect(Collectors.groupingBy(w -> w.length()));
	}
	
	public static String firstWordWith5Chars(List<String> words) {
		return words.stream().filter(w -> w.length()==5).findFirst().orElse(null);
	}
	
	public static List<String> flat(List<List<String>> words){
		return words.stream().flatMap(list -> list.stream()).toList();
	}

}
