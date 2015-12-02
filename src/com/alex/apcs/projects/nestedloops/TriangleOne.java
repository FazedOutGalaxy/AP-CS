package com.alex.apcs.projects.nestedloops;

public class TriangleOne {
	
	public static String createTriangle(int times, String letter) {
		String to = "";
		for (int a = 1; a <= times; a++) {
			for (int b = 0; b < a; b++) {
				to += letter;
			}
			to += "\n";
		}
		return to;
	}
	
}
