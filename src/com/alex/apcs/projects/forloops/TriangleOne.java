package com.alex.apcs.projects.forloops;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TriangleOne extends ApcsProject {
	
	private String word;

	public TriangleOne() {
		word = "Alex_is_Swag";
	}

	public TriangleOne(String word) {
		setWord(word);
	}

	public void setWord(String word) {
		this.word = word.replace(' ', '_');
	}

	public void print() {
		for (int l = word.length(); l > -1; l--) {
			printLine(word.substring(0, l));
		}
	}

	@Override
	public void execute() {
		print();
	}
}