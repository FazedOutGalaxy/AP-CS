package com.alex.apcs.projects.whileloops;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ReverseNumber {
	
	private int number;

	public ReverseNumber() {
		setNumber(UtilRandomNumbers.getRandomInteger(1, 100000));
	}
	
	public ReverseNumber(int number) {
		setNumber(number);
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getReverse() {
		return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
		/*int temp = number;
		int rev = 0;
		byte power = (byte) String.valueOf(temp).length();
		while (temp > 0) {
			rev += (int) Math.pow((temp % 10), power);
			temp /= 10;
			power--;
		}
		return rev;*/
	}
	
	@Override
	public String toString() {
		return number + " reversed is " + getReverse();
	}

}