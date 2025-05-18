package com.example.practice;

import java.util.*;

public class CoordinateTraversal {

	public static int[] finalCoordinates(String directions) {
		int x = 0, y = 0;
		String[] tokens;
		
		if (directions.contains(" ")) {
			tokens = directions.split("\\s+");
		} else {
			tokens = directions.split(""); // splits "UUU" into ["U", "U", "U"]
		}

		for (String token : tokens) {
			if (token.contains("x")) {
				String[] parts = token.split("x");
				int multiplier = Integer.parseInt(parts[0]); 
				String direction = parts[1].toUpperCase(); 

				if (direction.equals("RIGHT")) {
					x += multiplier;
				} else if (direction.equals("LEFT")) {
					x -= multiplier;
				} else if (direction.equals("UP")) {
					y += multiplier;
				} else if (direction.equals("DOWN")) {
					y -= multiplier;
				}
			} else {
				switch (token.toUpperCase()) {
				case "UP":
				case "U":
					y += 1;
					break;
				case "DOWN":
				case "D":
					y -= 1;
					break;
				case "RIGHT":
				case "R":
					x += 1;
					break;
				case "LEFT":
				case "L":
					x -= 1;
					break;
				}
			}
		}

		return new int[] { x, y };
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(finalCoordinates("UUU"))); 
		System.out.println(Arrays.toString(finalCoordinates("URRDDL"))); 
		System.out.println(Arrays.toString(finalCoordinates("DOWN UP 2xRIGHT DOWN 3xLEFT"))); 
	}
}
