package com.alex.apcs.projects.arrays;

import com.alex.apcs.utils.numbers.UtilBasicMath;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class OddsAndEvens {
	
	private static int countEm(int[] array, boolean odd) {
		int sum = 0;
		for (int i : array) {
			if (odd) {
				if (UtilBasicMath.isOdd(i))
					sum++;
			} else
				if (UtilBasicMath.isEven(i))
					sum++;
				
		}
		return sum;
	}

	public static int[] getAllEvens(int[] array) {
		int[] ar = new int[countEm(array, false)];
		byte index = 0;
		for (int i : array) {
			if (UtilBasicMath.isEven(i)) {
				ar[index] = i;
				index++;
			}
		}
		return ar;
	}

	public static int[] getAllOdds(int[] array) {
		int[] ar = new int[countEm(array, true)];
		byte index = 0;
		for (int i : array) {
			if (UtilBasicMath.isOdd(i)) {
				ar[index] = i;
				index++;
			}
		}
		return ar;
	}
}