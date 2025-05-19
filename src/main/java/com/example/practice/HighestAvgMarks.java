package com.example.practice;

import java.util.*;

public class HighestAvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] input = {
	            {"Charles", "84"},
	            {"John", "100"},
	            {"Andy", "37"},
	            {"John", "23"},
	            {"Charles", "20"}
	        };
		highestAvg(input);
	}
	
	public static void highestAvg(String[][] input) {
		Map<String, List<Integer>> map = new HashMap<>();
		for(String[] entry:input) {
			String name = entry[0];
			int marks = Integer.parseInt(entry[1]);
			
			if(!map.containsKey(name)) {
				map.put(name, new ArrayList<>());
			}
			map.get(name).add(marks);
		}
		
		String topStudent = "";
		double maxAvg = 0.0;
		for(Map.Entry<String, List<Integer>> entry:map.entrySet()) {
			String name = entry.getKey();
			List<Integer> marks = entry.getValue();
			double average = marks.stream().mapToInt(i -> i.intValue()).average().orElse(0.0);
			
//			int floorAvg = (int) Math.floor(average);
//		    int ceilAvg = (int) Math.ceil(average);
			
			if(average>maxAvg) {
				topStudent = name;
				maxAvg = average;
			}
		}
		
		System.out.println("Max avg is : "+maxAvg+" and student name is : "+topStudent);
	}
}
