package com.alex.apcs.projects.forloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class VowelCounter {
	
	public static String getNumberString(String s) {
		String next = "";
		for (byte i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' ||
					c == 'O' || c == 'U')
				next += i;
			else
				next += c;
		}
		return next;
	}
}
