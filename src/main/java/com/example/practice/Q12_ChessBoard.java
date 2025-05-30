package com.example.practice;

public class Q12_ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bishopRow = 2; int bishopCol = 1;
		int fixedRow = 5; int fixedCol = 5;
		System.out.println(canBishopReach(bishopRow, bishopCol, fixedRow, fixedCol));
	}

	private static String canBishopReach(int bishopRow, int bishopCol, int fixedRow, int fixedCol) {
		
		// Check if both pieces are on the same color (both white or both black)
		if((bishopRow+fixedRow)%2 != (bishopCol+fixedCol)%2) {
			return "No"; // Different colors, bishop cannot reach the immovable piece
		}
		
		// Check if both pieces are on the same diagonal
		else if(Math.abs(bishopRow-fixedRow) == Math.abs(bishopCol-fixedCol)){
			return "Yes\n1"; // They are on the same diagonal, bishop can reach in 1 move
		}
		
		// If the pieces are on different diagonals but are on the same color, Bishop can reach in 2 moves
		return "Yes\n2";
	}

}
