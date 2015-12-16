package com.alex.apcs.projects.sortsearch;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberShifter {
	
	public static int[] makeLucky7Array(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = UtilRandomNumbers.getRandomInteger(0, 10);
		}
		return array;
	}

	public static void shiftEm(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j < array.length && array[j] != 7) j++;
			if (j != i && j < array.length) {
				int t = array[j];
				array[j] = array[i];
				array[i] = t;
			}
		}
	}
}