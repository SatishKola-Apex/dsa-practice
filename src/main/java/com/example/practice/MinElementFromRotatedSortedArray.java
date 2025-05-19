package com.example.practice;

public class MinElementFromRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5, 6, 1, 2, 3, 4};
		System.out.println(minElement(arr1));
	}

	public static int minElement(int[] arr) {
		int left=0;
		int right = arr.length-1;
		
		while(left < right) {
			int mid = (left+right)/2;
			
			if(arr[mid] > arr[right]) {
				left = mid+1;
			}
			else {
				right=mid;
			}
		}
		
		return arr[left];
	}
}
