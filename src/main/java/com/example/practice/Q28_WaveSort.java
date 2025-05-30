package com.example.practice;

import java.util.Arrays;

public class Q28_WaveSort {
	public static void main(String[] args) {
		int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
		waveSort1(arr);
//		waveSort2(arr);
	}

	private static void waveSort1(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i += 2) {
			// If previous is greater, swap
			if (i > 0 && arr[i] < arr[i - 1]) {
				swap(arr, i, i - 1);
			}

			// If next is greater, swap
			if (i < n - 1 && arr[i] < arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void waveSort2(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i=i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] =temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
