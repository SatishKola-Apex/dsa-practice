package com.example.practice;

import java.util.*;

public class Q16_MostFrequentIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {
	            "10.0.0.1 bytes=32 time=50ms TTL=63",
	            "10.0.0.2 bytes=32 time=50ms TTL=73",
	            "10.0.0.4 bytes=32 time=50ms TTL=83",
	            "10.0.0.2 bytes=32 time=50ms TTL=93"
	        };
	        
		String result = findMostFrequentIP(str);
	    System.out.println("The most frequent IP is: " + result);
	}

	private static String findMostFrequentIP(String[] str) {
		// TODO Auto-generated method stub
		Map<String, Integer> ipFreq = new HashMap<>();
		for(String entry: str) {
			String ip = entry.split(" ")[0];
			
			if(isValid(ip)) {
				ipFreq.put(ip, ipFreq.getOrDefault(ip, 0)+1);
			}
		}
		String mostFreqIP="";
		int maxFreq = 0;
		for(Map.Entry<String, Integer> entry: ipFreq.entrySet()) {
			if(entry.getValue()>maxFreq) {
				maxFreq = entry.getValue();
				mostFreqIP = entry.getKey();
			}
		}
		
		return mostFreqIP;
	}

	private static boolean isValid(String ip) {
		// TODO Auto-generated method stub
		String[] parts = ip.split(".");
		if(parts.length != 4) {
			return false;
		}
		
		for(String part: parts) {
			int num = Integer.parseInt(part);
			if(num < 0 && num > 255) {
				return false;
			}
		}
		return true;
	}	
}
