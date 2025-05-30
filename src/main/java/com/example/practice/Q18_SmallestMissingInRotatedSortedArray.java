package com.example.practice;

public class Q18_SmallestMissingInRotatedSortedArray {

    // Function to find the pivot (smallest element) using binary search
    public static int findPivot(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the smallest element (pivot)
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;  // pivot is at index mid
            } 
            // If mid element is larger than the rightmost element, pivot is on the right
            else if (arr[mid] > arr[right]) {
                left = mid + 1;
            } 
            // Otherwise, pivot is on the left
            else {
                right = mid - 1;
            }
        }

        return 0;  // If the array is not rotated, the pivot is the first element
    }

    // Function to find the smallest missing integer in the rotated array
    public static int findSmallestMissing(int[] arr) {
        int pivot = findPivot(arr);  // Find the pivot (smallest element index)
        int n = arr.length;

        // Check the missing integer in the left side (before the pivot)
        for (int i = pivot; i < n; i++) {
            // The expected value should be i - pivot (since the array is rotated)
            if (arr[i] != i - pivot) {
                return i - pivot;  // The missing number is i - pivot
            }
        }

        // Check the missing integer in the right side (after the pivot)
        for (int i = 0; i < pivot; i++) {
            // The expected value should be i + (n - pivot) (adjusted for the rotation)
            if (arr[i] != i + (n - pivot)) {
                return i + (n - pivot);  // The missing number is i + (n - pivot)
            }
        }

        return n;  // If no missing integer is found, the missing integer is n
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6, 1, 2};
        System.out.println(findSmallestMissing(arr1)); // Output: 0

        int[] arr2 = {2, 3, 4, 5, 6, 0, 1};
        System.out.println(findSmallestMissing(arr2)); // Output: 7
    }
}
