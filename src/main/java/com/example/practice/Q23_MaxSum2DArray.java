package com.example.practice;

public class Q23_MaxSum2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {10, 10, 2, 0, 20, 4},
	            {1,   0, 0, 30, 2, 5},
	            {0,  10, 4,  0, 2, 0},
	            {1,   0, 2, 20, 0, 4}
	        };
		
		System.out.println(maxSum(matrix));
	}

	private static int maxSum(int[][] matrix) {
		// TODO Auto-generated method stub
		int maxSum =0;
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		int[][] sumTrack = new int[rows][columns];
		for(int j=0; j<columns; j++) {
			sumTrack[0][j] = matrix[0][j];
		}
		
		for(int i=1; i<rows; i++) {
			for(int j=0; j<columns; j++) { 
				int up = sumTrack[i-1][j];
				int leftUpDia = (j>0)?sumTrack[i-1][j-1]:0;
				int rightUpDia = (j<columns-1)?sumTrack[i-1][j+1]:0;
				
				int max = Math.max(up, Math.max(leftUpDia, rightUpDia));
				sumTrack[i][j] = matrix[i][j] + max;
			}
		}
		
		for(int k=0; k<columns; k++) {
			maxSum = Math.max(maxSum, sumTrack[rows-1][k]);
		}
		
		return maxSum;
	}

}
