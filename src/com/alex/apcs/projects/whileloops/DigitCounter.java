package com.alex.apcs.projects.whileloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DigitCounter {
	
	public static int countDigits(int number) {
		return String.valueOf(number).replace("-", "").length();
	}
}