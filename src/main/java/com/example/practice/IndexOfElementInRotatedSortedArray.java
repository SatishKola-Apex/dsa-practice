package com.example.practice;

public class IndexOfElementInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = null;
        int target = 0;
        int index = findIndex(arr, target);
        if (index != -1) {
            System.out.println("Target index is: " + index);
        } else {
            System.out.println("Target not found.");
        }
	}
	
	public static int findIndex(int[] arr, int target) {
		
		if(arr == null || arr.length==0) {
			System.out.println("Array is empty or null");
			return -1;
		}
		
		int left=0, right=arr.length-1;
		
		while(left<=right) {
			
			int mid = left+(right-left)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(arr[left] <= arr[mid]) {
				if(arr[left] <= target && target < arr[mid]) {
					right=mid-1;
				}
				else {
					left=mid+1;
				}
			}
			else {
				if(arr[mid] < target && target <= arr[right]) {
					left=mid+1;
				}
				else {
					right=mid-1;
				}
			}
		}
        return -1;
    }
}
