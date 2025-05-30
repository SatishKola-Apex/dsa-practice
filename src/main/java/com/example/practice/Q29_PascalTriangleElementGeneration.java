package com.example.practice;

public class Q29_PascalTriangleElementGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowNum = 0;
		int elementIndex = 0;
		System.out.println(generateElement(rowNum, elementIndex));
	}

	private static int generateElement(int rowNum, int elementIndex) {
		// TODO Auto-generated method stub
		if(rowNum<0 || elementIndex>rowNum) {
			return -1;
		}
		
		int value = 1;
		for(int i=0; i<elementIndex; i++) {
			value = value * (rowNum-i)/(i+1);
		}
		return value;
	}
	
	
}
