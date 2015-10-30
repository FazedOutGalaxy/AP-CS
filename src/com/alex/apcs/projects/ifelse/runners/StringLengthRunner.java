package com.alex.apcs.projects.ifelse.runners;

import java.util.HashMap;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.StringLengthCheck;

public class StringLengthRunner extends ApcsProject {

	private static final StringLengthRunner instance = new StringLengthRunner();
	private static final HashMap<String, String> params = new HashMap<String, String>();
	
	@Override
	public void execute() {
		StringLengthCheck slc = new StringLengthCheck("hello", "goodbye");
		printLine(slc);
		for (String s : params.keySet()) {
			slc.setStrings(s, params.get(s));
			printLine(slc);
		}
	}

	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.put("one", "two");
		params.put("three", "four");
		params.put("TCEA", "UIL");
		params.put("State", "Champions");
		params.put("ABC", "DEF");
		params.put("four", "five");
		params.put("whoot", "what");
	}

}
