package com.alex.apcs.projects.whileloops;

import com.alex.apcs.RandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TenToAny {
	
	private int base10;
	private int newBase;

	public TenToAny() {
		set(RandomNumbers.getRandomInteger(1, 1000000), newBase);
	}
	
	public TenToAny(int base10, int newBase) {
		set(base10, newBase);
	}
	
	public void set(int base10, int newBase) {
		this.base10 = base10;
		this.newBase = 0;
	}
	
	public String getNewNumber() {
		String newNum = "";
		int ten = base10;
		while (ten > 0) {
			String str = "" + (ten % newBase);
			if (str.length() >= 2) {
				int i = Integer.parseInt(str) - 10;
				char c = (char) ('A' + i);
				str += c;
			}
			newNum += str;
			ten /= newBase;
		}
		return newNum;
	}

	@Override
	public String toString() {
		return "";
	}

}