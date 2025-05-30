package com.example.practice.May29Assignment;

import java.util.*;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Odd Nums are : "+filterOdd(numbers));
		System.out.println("Sum is: "+sum(numbers));
		System.out.println("Max num is: "+max(numbers));
		System.out.println("Avg of Even Nums is: "+evenAvg(numbers));
		System.out.println("Unique sorted nums are : "+removeDupsSort(Arrays.asList(5, 3, 9, 5, 1, 3, 8)));
		System.out.println("Double of nums are : "+doubleEachNum(numbers));
		System.out.println("First Num divisible by 3 is : "+numDivisibleBy3(numbers));
	}

	private static List<Integer> filterOdd(List<Integer> numbers) {
		// TODO Auto-generated method stub
//		List<Integer> oddNums = new ArrayList<>();
//		for(int num:numbers) {
//			if(num%2==1) {
//				oddNums.add(num);
//			}
//		}
//		return oddNums;
		
		return numbers.stream().filter(i->i%2==1).toList();
	}

	private static int sum(List<Integer> numbers) {
		// TODO Auto-generated method stub
//		int sum=0;
//		for(int num:numbers) {
//			sum+=num;
//		}
//		return sum;
		
		return numbers.stream().mapToInt(i -> i.intValue()).sum();
	}
	
	private static int max(List<Integer> numbers) {
		// TODO Auto-generated method stub
//		int max=Integer.MIN_VALUE;
//		for(int num: numbers) {
//			if(num>max) {
//				max=num;
//			}
//		}
//		return max;
		
		return numbers.stream().max(Comparator.comparingInt(i -> i.intValue())).get();
//		return numbers.stream().mapToInt(i -> i.intValue()).max().orElse(0);
	}

	private static double evenAvg(List<Integer> numbers) {
		// TODO Auto-generated method stub
//		double avg = 0.0;
//		int evenCount =0;
//		int evenSum=0;
//		
//		for(int num: numbers) {
//			if(num%2==0) {
//				evenCount++;
//				evenSum+=num;
//			}
//		}
//		avg=evenSum/evenCount;
//		return avg;
		
		return numbers.stream().filter(i -> i%2==0).mapToInt(i -> i.intValue()).average().orElse(0.0);
	}
	
	public static List<Integer> removeDupsSort(List<Integer> nums) {		
		return nums.stream().distinct().sorted().toList();
	}
	
	private static List<Integer> doubleEachNum(List<Integer> numbers) {
		return numbers.stream().map(i -> i*2).toList();
	}
	
	private static int numDivisibleBy3(List<Integer> numbers) {
		return numbers.stream().filter(i -> i%3==0).findFirst().orElse(-1);
	}
}
