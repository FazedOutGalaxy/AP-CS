package com.alex.apcs.projects.forloops;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Box extends ApcsProject {
	
	private String word;

	public Box() {
		setWord("swagger");
	}

	public Box(String word) {
		setWord(word);
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void print() {
		for (byte i = 0; i < word.length(); i++)
			printLine(word);
		printEmptyLines(2);
	}
	
	@Override
	public void execute() {
		print();
	}
}