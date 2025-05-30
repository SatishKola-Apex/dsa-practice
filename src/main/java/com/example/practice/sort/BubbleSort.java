package com.example.practice.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,3};
		bubbleSort2(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//ChatGPT
	public static void bubbleSort2(int[] arr) {
	    int n = arr.length;
	    boolean swapped;
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;
	        for (int j = 0; j < n - 1 - i; j++) { //Here after each iteration one element from last will 
	        	//be sorted, so here we can reduce iteration by 1 after each iteration so using -i.
	            if (arr[j] > arr[j + 1]) {
	                // swap arr[j] and arr[j+1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	                swapped = true;
	            }
	        }
	        if (!swapped) break; // optimization if already sorted. After one complete inner loop if nothing 
	        //is swapped then it means the array is already sorted so we no need to check again that's why breaking the outer loop.
	    }
	    System.out.println(Arrays.toString(arr));
	}

}
