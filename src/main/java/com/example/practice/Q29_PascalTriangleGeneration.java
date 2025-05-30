package com.example.practice;

import java.util.*;

public class Q29_PascalTriangleGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generatePascalTriangle(5);
	}

	private static void generatePascalTriangle(int numRows) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList<>();
		for(int i=0; i<numRows; i++) {
			List<Integer> row = new ArrayList<>();
			row.add(1);
			
			for(int j=1; j<i; j++) { //i+1 elements in a row, in this loop need i-1 elements
				row.add(triangle.get(i-1).get(j)+triangle.get(i-1).get(j-1));
			}
			
			if(i>0) {
				row.add(1);
			}
			triangle.add(row);
		}
		
		for(List<Integer> row:triangle) {
			System.out.println(row);
		}
	}
}
