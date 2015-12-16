package com.alex.apcs.projects.sortsearch.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.sortsearch.WordSort;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class WordSortRunner extends ApcsProject {
	
	private static final WordSortRunner instance = new WordSortRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		ws.sort();
		printLine(ws);
		ws.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		ws.sort();
		printLine(ws);
		ws.setList("b x 4 r s y $");
		ws.sort();
		printLine(ws);
		ws.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		ws.sort();
		printLine(ws);
	}
}