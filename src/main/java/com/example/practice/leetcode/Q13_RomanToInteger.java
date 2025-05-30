package com.example.practice.leetcode;

import java.util.*;

public class Q13_RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = "MCMXCIV";
		System.out.println(romanToInt(roman));
	}
	
	public static int romanToInt(String s) {
        Map<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I',1);
        symbolMap.put('V',5);
        symbolMap.put('X',10);
        symbolMap.put('L',50);
        symbolMap.put('C',100);
        symbolMap.put('D',500);
        symbolMap.put('M',1000);

        int result = 0;
        int current = 0;
        int previous = 0;
        for(int i=s.length()-1; i>=0; i--){
            current = symbolMap.get(s.charAt(i));
            if(current<previous){
                result-=current;
            }
            else{
                result+=current;
            }
            previous = current;
        }
        return result;
    }

}
