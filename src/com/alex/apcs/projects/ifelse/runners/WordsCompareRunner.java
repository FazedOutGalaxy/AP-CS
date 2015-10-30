package com.alex.apcs.projects.ifelse.runners;

import java.util.HashMap;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.WordsCompare;

public class WordsCompareRunner extends ApcsProject {

	private static final WordsCompareRunner instance = new WordsCompareRunner();
	private static final HashMap<String, String> params = new HashMap<String, String>();
	
	@Override
	public void execute() {
		WordsCompare wc = new WordsCompare("abe", "ape");
		wc.compare();
		printLine(wc);
		for (String s : params.keySet()) {
			wc.setStrings(s, params.get(s));
			wc.compare();
			printLine(wc);
		}
	}
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static synchronized void init() {
		params.clear();
		params.put("giraffe", "gorilla");
		params.put("one", "two");
		params.put("fun", "funny");
		params.put("123", "19");
		params.put("193", "1910");
		params.put("goofy", "godfather");
		params.put("funnel", "fun");
	}
	
}
