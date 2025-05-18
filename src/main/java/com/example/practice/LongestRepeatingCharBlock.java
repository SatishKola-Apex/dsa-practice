package com.example.practice;

public class LongestRepeatingCharBlock {

	public static void main(String[] args) {
		System.out.println(longestRepeatingCharBlock("aaaaaabbbbCCdd"));
	}
	
	public static String longestRepeatingCharBlock(String str) {
		if(str==null || str.isEmpty()) {
			return "";
		}
		
		StringBuilder currentBlock=new StringBuilder();
		String result = "";
		char currentChar = str.charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			if(currentChar==str.charAt(i)) {
				currentBlock.append(str.charAt(i));
			}
			else{
				if(currentBlock.length()>result.length()) {
					result=currentBlock.toString();
				}
				currentBlock.delete(0, currentBlock.length());
//				currentBlock.setLength(0);
				currentBlock.append(str.charAt(i));
				currentChar = str.charAt(i);
			}	
		}
		
		if(currentBlock.length()>result.length()) {
			result=currentBlock.toString();
		}
		
		int startIndex = str.indexOf(result);

		return "Longest Repeating Char Block is : "+result+" and index is : "+startIndex;
	}

}
