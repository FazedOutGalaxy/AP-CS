package com.alex.apcs.projects.references.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Words {
	
	private ArrayList<Word> words;

	public Words() {
		setWords("Swag, Swagger, Swaggest, Shotgun");
	}

	public Words(String wordList) {
		setWords(wordList);
	}

	public void setWords(String wordList) {
		for (String s : wordList.split("[\\s,]+"))
			words.add(new Word(s));
	}

	public int countWordsWithXChars(int size) {
		int count = 0;
		Iterator<Word> iter = words.iterator();
		while (iter.hasNext()) {
			Word w = iter.next();
			if (w.getLength() == size)
				count++;
		}
		return count;
	}

	// this method will remove all words with a specified size / length
	// this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size) {
		int sum = 0;
		Iterator<Word> iter = words.iterator();
		while (iter.hasNext()) {
			Word w = iter.next();
			if (w.getLength() == size) {
				sum += w.getNumVowels();
				words.remove(w);
			}
		}
		return sum;
	}

	public int countWordsWithXVowels(int numVowels) {
		int count= 0;
		Iterator<Word> iter = words.iterator();
		while (iter.hasNext()) {
			Word w = iter.next();
			if (w.getNumVowels() == numVowels)
				count++;
		}
		return count;
	}

	public String toString() {
		return words.toString();
	}
}