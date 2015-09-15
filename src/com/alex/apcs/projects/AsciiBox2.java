package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class AsciiBox2 extends ApcsProject {

	@Override
	public void execute() {
		printLine("Alex Chiang \t 9/15/2015");
		printLine();
		printLine();
		printBorder();
		printAir();
		printLine("***\t     Comp Sci\t\t***");
		printAir();
		printBorder();
	}
	
	
	private void printAir() {
		for (int i = 0; i < 4; i++) {
			printLine("***\t\t\t\t***");
		}
	}
	
	private void printBorder() {
		for (int i = 0; i < 2; i++) {
			printLine("***********************************");
		}
	}

}
