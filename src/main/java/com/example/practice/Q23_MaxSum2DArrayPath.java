package com.example.practice;

import java.util.*;

public class Q23_MaxSum2DArrayPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {10, 10, 2, 0, 20, 4},
	            {1,   0, 0, 30, 2, 5},
	            {0,  10, 4,  0, 2, 0},
	            {1,   0, 2, 20, 0, 4}
	        };
		
		trackPath(matrix);
	}
	
	public static void trackPath(int[][] matrix) {
		int maxSum = 0;
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		int[][] indexTrack = new int[rows][columns];
		
		int[][] sumTrack = new int[rows][columns];
		for(int i=0; i<columns; i++) {
			sumTrack[0][i] = matrix[0][i];
		}
		
		for(int i=1; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				int up = sumTrack[i-1][j];
				int leftUpDia = (j>0)?sumTrack[i-1][j-1]:0;
				int rightUpDia = (j<columns-1)?sumTrack[i-1][j+1]:0;
				
				int maxValue = up;
				int prevCol = j;
				
				if(j>0 && leftUpDia>maxValue) {
					maxValue=leftUpDia;
					prevCol=j-1;
				}
				
				if(j<columns-1 && rightUpDia>maxValue) {
					maxValue=rightUpDia;
					prevCol=j+1;
				}
				
				sumTrack[i][j] = matrix[i][j]+maxValue;
				indexTrack[i][j] = prevCol;
			}
		}
		
		int maxColIndex = 0; //to get the column index of maxSum, it is used for back tracking of path
		for(int i=0; i<columns; i++) {
			if(sumTrack[rows-1][i]>maxSum) {
				maxSum = sumTrack[rows-1][i];
				maxColIndex=i;
			}
		}
		
		List<Integer> path = new ArrayList<>();
		int currentRow = rows-1;
		int currentCol = maxColIndex;
		while(currentRow>=0) {
			path.add(matrix[currentRow][currentCol]);
			currentCol = indexTrack[currentRow][currentCol];
			currentRow--;
		}
		
		System.out.println("Max sum is : "+ maxSum);
		Collections.reverse(path);
		System.out.println("Path is : "+path);
	}
}
