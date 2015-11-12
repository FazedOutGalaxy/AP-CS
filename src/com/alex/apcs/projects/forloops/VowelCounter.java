package com.alex.apcs.projects.forloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class VowelCounter {
	
	public static String getNumberString(String s) {
		String next = "";
		byte index = 0;
		for (byte i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' ||
					c == 'O' || c == 'U' ||
					c == 'a' || c == 'e' || c == 'i' ||
					c == 'o' || c == 'u') {
				next += index;
				index++;
				if (index >= 10) 
					index = 0;
			} else
				next += c;
		}
		return next;
	}
}
