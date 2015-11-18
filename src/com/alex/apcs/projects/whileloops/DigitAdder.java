package com.alex.apcs.projects.whileloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DigitAdder {
	
	public static int sumDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += (number % 10);
			number /= number;
		}
		return sum;
	}
}