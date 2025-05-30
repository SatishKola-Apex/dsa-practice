package com.example.practice.leetcode;

public class Q07_ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-123));
	}
	
	public static int reverse(int x) {
		int sign =1;
		if(x<0) {
			sign=-1;
			x*=-1;
		}
        int reversed = 0;
        while(x!=0){
            reversed = reversed*10 + x%10;
            x=x/10;
        }
        return reversed*sign;
    }

}
