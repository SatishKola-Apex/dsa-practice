package com.example.practice;

public class Q05_MedianOfTwoSortedArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};

        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println("Median is: " + median);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
//			int[] temp = nums1;
//			nums1 = nums2;
//			nums2 = temp;
		}
		int x = nums1.length;
		int y = nums2.length;

		int low = 0;
		int high = x;

		// while( low <- high){
		while (low <= high) {
			int partX = (low + high) / 2;
			int partY = (x + y + 1) / 2 - partX;
			int maxLeftX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
			int minRightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX];

			int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
			int minRightY = (partY == y) ? Integer.MAX_VALUE : nums2[partY];

			if (maxLeftX < minRightY && maxLeftY < minRightX) { // correct success
				if ((x + y) % 2 == 0) {
					return (double) (Math.max(maxLeftY, maxLeftX) + Math.min(minRightX, minRightY)) / 2;
				} else {
					return (double) Math.max(maxLeftX, maxLeftY);

				}

			} else if (maxLeftX > minRightY) {
				high = partX - 1;

			} else {
				low = partX + 1;
			}

		}
		return -1;

	}
}
