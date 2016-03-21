package com.alex.apcs.projects.recursion;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class AtCounter {
	private String[][] atMat;

	public AtCounter() {
		// size the matrix
		atMat = new String[10][10];
		
		// use nested loops to randomly load the matrix
		// you will need to use Math.random()
		for (byte a = 0; a < atMat.length; a++)
			for (byte b = 0; b < atMat[a].length; b++) {
				int random = UtilRandomNumbers.getRandomInteger(1, 2);
				atMat[a][b] = (random == 1) ? "@" : "-";
			}
	}

	public int countAts(int r, int c) {
		// add in recursive code to count up the # of @s connected
		// start checking at spot [r,c]
		
		return 0;
	}
	
	private boolean isInBounds(int r, int c) {
		return (r > 0 && r < atMat.length) && (c > 0 && c < atMat[r].length);
	}

	/**
	 * this method will return all values in the matrix this method should
	 * return a view of the matrix that looks like a matrix
	 */
	@Override
	public String toString() {
		return "";
	}
}