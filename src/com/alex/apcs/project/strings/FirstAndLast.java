package com.alex.apcs.project.strings;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class FirstAndLast extends ApcsProject {
	
	public boolean print = true;
	private String original;
	private char first, last;
	
	public FirstAndLast(String original) {
		this.original = original;
	}
	
	public synchronized void calculate() {
		first = original.charAt(0);
		last = original.charAt(original.length() - 1);
	}
	
	@Override
	public String toString() {
		return "First Letter: " + first + "\n" + "Last Letter: " + last;
	}
	
	public void print() {
		printLine(toString());
	}
	
	@Override
	public void execute() {
		 calculate();
		 if (print)
			 print();
	}
}
