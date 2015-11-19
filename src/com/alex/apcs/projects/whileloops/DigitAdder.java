package com.alex.apcs.projects.whileloops;

public class DigitAdder {

	public static int sumDigits(int number) {
		int sum = 0;
		int temp = number;
		while (temp > 0) {
			sum += (temp % 10);
			temp /= 10;
		}
		return sum;
	}
}
