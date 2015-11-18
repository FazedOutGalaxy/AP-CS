package com.alex.apcs.projects.whileloops;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Perfect {
	private int number;

	public Perfect() {
		setNumber(UtilRandomNumbers.getRandomInteger(1, 10000000));
	}
	
	public Perfect(int number) {
		setNumber(number);
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPerfect() {
		String[] parse = Divisors.getDivisors(number).split(" ");
		int[] ints = new int[parse.length];
		for (byte index = 0; index < ints.length; index++) {
			ints[index] = Integer.parseInt(parse[index]);
		}
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		return (sum == number);
	}

	@Override
	public String toString() {
		return number + " is" + ((isPerfect()) ? " " : " not ") + "perfect.";
	}

}