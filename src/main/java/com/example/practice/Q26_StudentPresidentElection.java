package com.example.practice;

import java.util.*;

public class Q26_StudentPresidentElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students = 4;
		int len = 2;
		
		electPresident(students, len); //Brute force approach. time O(n²) (due to list.remove in middle), space O(n)
		//why O(n^2) - When you remove an element at index i, it shifts all elements after i one position to the left.
		//Cost of one remove: O(n) in worst case, this repeats for n-1 times -> O(n - 1) * O(n) = O(n²)
	
		//findPresident(students, len); //iterative version of the Josephus. Time O(n), SpaceO(1)
	}

	private static void electPresident(int students, int len) {
		// TODO Auto-generated method stub
		List<Integer> studentsList = new ArrayList<>();
		for(int i=1; i<=students; i++) {
			studentsList.add(i);
		}
		
		int result=0;
		while(studentsList.size()>1) {
			result = (result+(len-1))%studentsList.size();
			//We should move k-1 steps ahead to find the k-th person because the current student is also counted as step 1.
			//We use modulo (%) to wrap around the list if we go past the end.
			//Modulo ensures the index always stays within valid bounds of the list, like a circular buffer.
			studentsList.remove(result);
		}
		
		System.out.println("Elected student is at position : "+ result);
	}
	
	
	public static int findPresident(int n, int k) {
        int result = 0; // Base case: josephus(1, k) = 0 (0-indexed)

        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }

        return result + 1; // Convert to 1-indexed
    }

}
