package com.alex.apcs.projects.interfaces;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Word_Length implements Comparable<Word_Length> {
	
	private String word;

	public Word_Length(String word) {
		this.word = word;
	}

	private int length() {
		return word.length();
	}

	public int compareTo(Word_Length rhs) {
		if (length() > rhs.length())
			return 1;
		else if (length() < rhs.length())
			return -1;
		return 0;
	}

	public String toString() {
		return word;
	}
}