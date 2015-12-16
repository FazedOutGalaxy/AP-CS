package com.alex.apcs.projects.sortsearch;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberSorter {
	// instance variables and other methods not shown

	private static int getNumDigits(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] sorted = new int[getNumDigits(number)];
		byte index = (byte) (sorted.length - 1);
		while (number > 0) {
			sorted[index] = number % 10;
			index--;
			number /= 10;
		}
		return sorted;
	}
}