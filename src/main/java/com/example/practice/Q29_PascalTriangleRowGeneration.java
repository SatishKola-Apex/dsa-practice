package com.example.practice;

import java.util.*;

public class Q29_PascalTriangleRowGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateRow(4);
	}
	
	public static void generateRow(int rowNum) {
		List<Integer> row = new ArrayList<>();
		long value = 1;
		for(int i=0; i<rowNum; i++) {
			row.add((int) value);
			value = value * (rowNum-i)/(i+1);
		}
		row.add(1);
		System.out.println(row);
	}
}
