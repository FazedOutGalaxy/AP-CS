package com.alex.apcs.projects.ifelse;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberCompare {

	private int one, two;
	
	public NumberCompare() {
		setNumbers(UtilRandomNumbers.getRandomInteger(0, Integer.MAX_VALUE), UtilRandomNumbers.getRandomInteger(0, Integer.MAX_VALUE));
	}
	
	public NumberCompare(int one, int two) {
		setNumbers(one, two);
	}
	
	public void setNumbers(int one, int two) {
		this.one = one;
		this.two = two;
	}
	
	public int getLargest() {
		if (one > two) {
			return one;
		} else {
			return two;
		}
	}
	
	public int getSmallest() {
		if (one < two) {
			return one;
		} else {
			return two;
		}
	}
	
	@Override
	public String toString() {
		return one + " -- " + two + "\n" + "largest == " + getLargest() + "\n" + "smallest == " + getSmallest() + "\n" + "\n";
	}
}
