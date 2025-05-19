package com.example.practice;

public class customAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123";
		String str2 = "-123";

        System.out.println(stringToInt(str1));
        System.out.println(stringToInt(str2));
	}
	
	public static int stringToInt(String input) {
		if(input==null || input.isEmpty()) {
			return -1;
		}
		
		int result=0;
		int sign=1;
		int i=0;
		
		if(input.charAt(0)=='-') {
			sign=-1;
			i++;
		}
		
		for(;i<input.length();i++) {
			char ch = input.charAt(i);
			if(!Character.isDigit(ch)) {
				return -1;
			}
			result = result*10 + Character.getNumericValue(ch);
		}
		return result*sign;
	}

}
