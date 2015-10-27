package com.alex.apcs.projects.ifelse.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.NumberCompare;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberCompareRunner extends ApcsProject {

	private static final NumberCompareRunner instance = new NumberCompareRunner();
	private static final NumberCompare[] compares = {new NumberCompare(5, 6),
			new NumberCompare(45, 56), new NumberCompare(-25, 10324), 
			new NumberCompare(324, 12312), new NumberCompare(34, 33)};
	
	@Override
	public void execute() {
		for (NumberCompare nc : compares) {
			printLine(nc);
		}
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
	
}
