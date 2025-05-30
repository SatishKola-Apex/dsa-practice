package com.example.practice;

public class Q14_PowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOf10(1234));
	}

	public static boolean isPowerOf10(int num) {
		if (num < 0) {
			return false;
		}

		while (num % 10 == 0) {
			num = num / 10;
		}

		if (num == 1) {
			return true;
		}

		return false;
	}
}
