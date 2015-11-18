package com.alex.apcs.projects.whileloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Divisors {
	
	public static String getDivisors(int number) {
		String divisors = "";
		int a = 1;
		do {
			if (number % a == 0)
				divisors += a + " ";
			a++;
		} while (a != number);
		return divisors;
	}
}