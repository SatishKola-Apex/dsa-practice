package com.example.practice;

import java.util.*;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,9,6,8,2,5,6,3,9};
		int[] result = removeDups3(arr);
		System.out.println(Arrays.toString(result));
		
		String[] arrStr = {"abc","def","abc","ghi"};
		String[] stringResult = removeDupsString(arrStr);
		System.out.println(Arrays.toString(stringResult));
	}

	private static String[] removeDupsString(String[] arrStr) {
		// TODO Auto-generated method stub
		int i=1;
		for(int j=1; j<arrStr.length; j++) {
			boolean dup = false;
			for(int k=0; k<i; k++) {
				if(arrStr[j].equals(arrStr[k])) {
					dup = true;
					break;
				}
			}
			if(!dup) {
				arrStr[i]=arrStr[j];
				i++;
			}
		}
		String[] result = new String[i];
		for(int k=0; k<result.length; k++) {
			result[k] = arrStr[k];
		}
		return result;
	}

	private static int[] removeDups(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int num:arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
		}
		
		int[] result = new int[freqMap.size()];
		int i=0;
		for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
			result[i++] = entry.getKey();
		}
		return result;
	}
	
	private static int[] removeDups2(int[] arr) {
		Arrays.sort(arr); //Or use custom sorting algorithm
		int i=0;
		for(int j=1; j<arr.length; j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		
		int[] result = new int[i+1];
		for(int k=0; k<result.length; k++) {
			result[k] = arr[k];
		}
		return result;
	}
	
	//[3, 5, 2, 8, 6i, 5, 6j]
	private static int[] removeDups3(int[] arr) {
		int i=1;
		for(int j=1; j<arr.length; j++) {
			boolean dup = false;
			for(int k=0; k<i; k++) {
				if(arr[j] == arr[k]) {
					dup = true;
					break;
				}
			}
			if(!dup) {
				arr[i]=arr[j];
				i++;
			}
		}
		int[] result = new int[i];
		for(int k=0; k<result.length; k++) {
			result[k] = arr[k];
		}
		return result;
	}


}
