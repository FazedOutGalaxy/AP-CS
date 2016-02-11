package com.alex.apcs.projects.references.list.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.list.NumberAnalyzer;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberAnalyzerRunner extends ApcsProject {

	private static final NumberAnalyzerRunner instance = new NumberAnalyzerRunner();

	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		printLine(test);
		printLine("odd count = " + test.countOdds());
		printLine("even count = " + test.countEvens());
		printLine("perfect count = " + test.countPerfects() + "\n\n\n");
	}
}