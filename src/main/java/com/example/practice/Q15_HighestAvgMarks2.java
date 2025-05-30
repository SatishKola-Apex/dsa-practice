package com.example.practice;

import java.util.*;

public class Q15_HighestAvgMarks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] input = {
			       {"Charles", "[84, 20, a]"},
			       {"John", "[100, 23]"},
			       {"Andy", "[37]"}
			    };
		highestAvg(input);
	}

	private static void highestAvg(String[][] input) {
		// TODO Auto-generated method stub
		String studentName="";
		double highestAvg = 0.0;
		
		for(String[] entry: input) {
			String name = entry[0];
			String marksArrStr = entry[1];
			
			List<Integer> marksArrInt = convertStrToIntArray(marksArrStr);
			double avg = marksArrInt.stream().mapToInt(i -> i.intValue()).average().orElse(0.0);
			
			if(avg>highestAvg) {
				highestAvg = avg;
				studentName = name;
			}
		}
		
		System.out.println(studentName+" has the highest average "+highestAvg);
	}

	private static List<Integer> convertStrToIntArray(String marksArrStr) {
		// if marksArrStr contains only [] then substring(1, length-1) results in an empty string as both start & end index is same 
		//then split will give [""] and then parseInt will throw NumberFormatException at Integer.parseInt("")
		//if marksArrStr contains only "" then substring will give StringIndexOutOfBoundsException, substring(1, -1) is invalid — indices out of bounds.
		//That is why checking length()<3, which eliminates "" & []
		if(marksArrStr == null || marksArrStr.trim().length()<3) {
			return new ArrayList<>();
		}
		
		List<Integer> marksIntArr = new ArrayList<>();
		String marks = marksArrStr.substring(1, marksArrStr.length()-1).trim();
		
		if(!marks.isEmpty()) {
			String[] strArr = marks.split(",");
			 for(String strMark: strArr) {
				 try {
					 int intMark = Integer.parseInt(strMark.trim());
					 marksIntArr.add(intMark);
				 } catch(NumberFormatException e) {
					 System.err.println("Skipping invalid mark: " + strMark);
				 }
			 }
		}
		
		return marksIntArr;
	}

}
