package com.example.practice.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,3,5,8,7,6,1};
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int minValueIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[minValueIndex]) {
					minValueIndex=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
