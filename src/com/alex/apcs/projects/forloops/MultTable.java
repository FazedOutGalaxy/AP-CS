package com.alex.apcs.projects.forloops;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MultTable extends ApcsProject {
	
	private int number;
	private int stop;
	
	public MultTable() {
		number = stop = 0;
	}

	public MultTable(int number, int stop) {
		setTable(number, stop);
	}

	public void setTable(int number, int stop) {
		this.number = number;
		this.stop = stop;
	}

	public void printTable() {
		printLine("multiplication table for " + number);
		for (int i = 1; i <= Math.abs(stop); i++) {
			printLine("" + i + "\t" + (i * number));
		}
		printEmptyLines(3);
	}
	
	@Override
	public void execute() {
		printTable();
	}
}