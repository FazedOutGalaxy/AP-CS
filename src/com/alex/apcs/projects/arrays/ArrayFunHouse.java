package com.alex.apcs.projects.arrays;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class ArrayFunHouse {
	// instance variables and constructors could be used, but are not really
	// needed

	// getSum() will return the sum of the numbers from start to stop, not
	// including stop
	public static int getSum(int[] numArray, int start, int stop) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			sum += numArray[i - 1];
		}
		return sum;
	}

	// getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val) {
		int times = 0;
		for (int i : numArray) {
			if (i == val)
				times++;
		}
		return times;
	}

	public static int[] removeVal(int[] numArray, int val) {
		int[] array = new int[numArray.length - getCount(numArray, val)];
		byte index = 0;
		for (int i : numArray) {
			if (i != val) {
				array[index] = i;
				index++;
			}
		}
		return array;
	}
}