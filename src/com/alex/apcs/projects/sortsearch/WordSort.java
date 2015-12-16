package com.alex.apcs.projects.sortsearch;

import java.util.Arrays;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class WordSort {
	
	private String[] wordRay;

	public WordSort(String line) {
		setList(line);
	}

	public void setList(String line) {
		wordRay = line.split(" ");
	}

	public void sort() {
		Arrays.sort(wordRay);
	}

	public String toString() {
		String ret = "";
		for (byte index = 0; index < wordRay.length; index++) {
			ret += "word " + index + " :: " + wordRay[index] + "\n";
		}
		return ret + "\n";
	}
}