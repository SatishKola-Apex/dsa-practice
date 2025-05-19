package com.example.practice;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};

        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println("Median is: " + median);
	}

	public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merging the arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copying remaining elements
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        // Calculating median
        int total = n1 + n2;
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0;
        }
    }
}
