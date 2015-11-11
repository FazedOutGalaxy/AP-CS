package com.alex.apcs.projects.forloops.runners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.Word;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class WordRunner extends ApcsProject {
	
	private static final WordRunner instance = new WordRunner();
	private static final List<String> params = new ArrayList<String>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add("Hello");
		params.add("World");
		params.add("JukeBox");
		params.add("TCEA");
		params.add("UIL");
	}
	
	@Override
	public void execute() {
		Word word = new Word();
		Iterator<String> iter = params.iterator();
		while (iter.hasNext()) {
			word.setWord(iter.next());
			printLine(word);
			printEmptyLines(2);
		}
	}
}