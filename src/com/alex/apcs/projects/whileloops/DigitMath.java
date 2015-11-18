package com.alex.apcs.projects.whileloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DigitMath {
	private static int countDigits(int number) {
		return DigitCounter.countDigits(number);
	}

	private static int sumDigits(int number) {
		return DigitAdder.sumDigits(number);
	}

	public static double averageDigits(int number) {
		return sumDigits(number) / countDigits(number);
	}
}