package com.alex.apcs.projects.ifelse.runners;

import java.util.HashMap;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.StringFirstLetterCheck;

public class StringFirstLetterRunner extends ApcsProject {

	private static final StringFirstLetterRunner instance = new StringFirstLetterRunner();
	private static final HashMap<String, String> params = new HashMap<String, String>();
	
	@Override
	public void execute() {
		StringFirstLetterCheck sflc = new StringFirstLetterCheck("hello", "howdy");
		printLine(sflc);
		for (String s : params.keySet()) {
			sflc.setStrings(s, params.get(s));
			printLine(sflc);
		}
	}
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.put("ABC", "DEF");
		params.put("State", "Champions");
		params.put("TCEA", "UIL");
		params.put("three", "two");	
		params.put("one", "two");
	}

}
