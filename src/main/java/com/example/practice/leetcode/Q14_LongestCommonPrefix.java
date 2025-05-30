package com.example.practice.leetcode;

public class Q14_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();
        String minLenStr = strs[0];

        for (String word : strs) {
            if (word.length() < minLenStr.length()) {
                minLenStr = word;
            }
        }

        for (int j = 0; j < minLenStr.length(); j++) {
            char ch = minLenStr.charAt(j);
            for (String word : strs) {
                if (word.charAt(j) != ch) {
                    return result.toString();
                }
            }
            result.append(ch);
        }

        return result.toString();
    }

}
