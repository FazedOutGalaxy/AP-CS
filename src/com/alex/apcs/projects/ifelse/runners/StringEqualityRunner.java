package com.alex.apcs.projects.ifelse.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.StringEquality;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class StringEqualityRunner extends ApcsProject {

	private static final StringEqualityRunner instance = new StringEqualityRunner();
	private static final StringEquality[] equals = {new StringEquality("hello", "goodbye"),
			new StringEquality("one", "two"), new StringEquality("three", "four"), 
			new StringEquality("TCEA", "UIL"), new StringEquality("ABC", "ABC"), 
			new StringEquality("ABC", "CBA"), new StringEquality("Same", "Same")};
	
	@Override
	public void execute() {
		for (StringEquality se : equals) {
			printLine(se);
		}
	}

	public static void main(String[] args) {
		instance.execute();
	}

}
