package com.example.practice;

import java.util.*;

public class Q25_BulbsPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle(100);
	}

	public static void puzzle(int num) {
//		List<Integer> bulbs = new ArrayList<>();
//		for (int i = 1; i <= num; i++) {
//			bulbs.add(0);
//		}
		
		int[] bulbs = new int[100];

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j += i) {
//				if (bulbs.get(j - 1) == 0) {
//					bulbs.set(j - 1, 1);
//				} else {
//					bulbs.set(j - 1, 0);
//				}
				bulbs[j-1] = bulbs[j-1]==0?1:0;
			}
		}

		int count = 0;
		for (int i = 0; i < num; i++) {
//			if (bulbs.get(i) ==1) {
//				count++;
//			}
			if(bulbs[i]==1) count++;
		}
		System.out.println(count);
	}
	
	public static void puzzle2(int num) {
        // The number of bulbs that remain ON is the count of perfect squares <= num
        int count = 0;

        // Find the square root of num, the highest integer whose square is <= num
        int i = 1;
        while (i * i <= num) {
            count++;  // Each perfect square contributes 1 bulb that will remain ON
            i++;
        }

        // Print the result
        System.out.println(count);
    }
}
