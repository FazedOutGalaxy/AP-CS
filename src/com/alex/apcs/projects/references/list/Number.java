package com.alex.apcs.projects.references.list;

import com.alex.apcs.RandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Number {
	private int number;

	public Number() {
		setNumber(RandomNumbers.getRandomInteger(1, 100));
	}

	public Number(int num) {
		setNumber(number);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public boolean isOdd() {
		return number % 2 == 1;
	}

	public boolean isPerfect() {
		int total = 0;
		for (int i = 1; i < number; i++)
			if (number % i == 0)
				total += i;
		return (number == total);
	}

	public String toString() {
		return "" + getNumber();
	}
}