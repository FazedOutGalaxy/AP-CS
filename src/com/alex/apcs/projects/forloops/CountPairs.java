package com.alex.apcs.projects.forloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CountPairs {
	
	public static int pairCounter(String str) {
		int count = 0;
		for (int index = 1; index <= str.length() - 1; index++) {
			if (str.charAt(index) == str.charAt(index - 1))
				count++;
		}
		return count;
	}
}