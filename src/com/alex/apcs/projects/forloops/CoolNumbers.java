package com.alex.apcs.projects.forloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CoolNumbers {
	
	private static int[] divideBy = {3, 4, 5, 6};
	
	/*
	 * method isCoolNumber will return true if num % 3-6 all have a remainder of
	 * 1it will return false otherwize
	 */
	public static boolean isCoolNumber(int num) {
		byte a = 0;
		for (int i : divideBy)
			if (num % i == 1) a++;
		return (a == 4);
	}

	/*
	 * method countCoolNumbers will return the countof the coolNumbers between 6
	 * and stop
	 */
	public static int countCoolNumbers(int stop) {
		if (stop == 6) return 1;
		int sum = 0;
		if (stop > 6) {
			for (int i = 6; i < stop; i++) {
				if (isCoolNumber(i))
					sum++;
			}
		} else {
			for (int i = stop; i < 6; i++) {
				if (isCoolNumber(i))
					sum++;
			}
		}
		return sum;
	}
}