package com.alex.apcs.projects.forloops;

import com.alex.apcs.utils.numbers.UtilBasicMath;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LoopStats {
	
	private int start, stop;

	public LoopStats() {
		setNumbers(1, 10);
	}

	public LoopStats(int start, int stop) {
		setNumbers(start, stop);
	}

	public void setNumbers(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}

	public int getEvenCount() {
		int total = 0;
		for (int i = start; start <= stop; start++) {
			if (UtilBasicMath.isEven(i)) {
				total++;
			}
		}
		return total;
	}

	public int getOddCount() {
		int total = 0;
		for (int i = start; start <= stop; start++) {
			if (UtilBasicMath.isOdd(i)) {
				total++;
			}
		}
		return total;
	}

	public int getTotal() {
		int sum = 0;
		for (int i = start; start <= stop; start++) {
			sum += i;
		}
		return sum;
	}

	public String toString() {
		return start + " " + stop + "\n" + "total " + getTotal() + "\n" + "even count " + getEvenCount() + "\n" + "odd count " + getOddCount();
	}
}