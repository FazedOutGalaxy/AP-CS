package com.alex.apcs.projects.interfaces;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Word_Vowels implements Comparable<Word_Vowels> {
	
	private static final String VOWELS = "AEIOUaeiou";
	private String word;

	public Word_Vowels(String word) {
		this.word = word;
	}

	private int numVowels() {
		int vowelCount = 0;
		for (char c : word.toCharArray())
			if (VOWELS.contains("" + c))
				vowelCount++;
		return vowelCount;
	}

	public int compareTo(Word_Vowels rhs) {
		if (numVowels() > rhs.numVowels())
			return 1;
		else if (numVowels() < rhs.numVowels())
			return -1;
		return 0;
	}

	public String toString() {
		return word;
	}
}