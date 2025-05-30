package com.example.practice;

public class Q18_SmallestMissingInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6};
		System.out.println(missingElement(arr));
	}

	private static int missingElement(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=i) {
				return i;
			}
		}
		return arr.length;
	}

}
