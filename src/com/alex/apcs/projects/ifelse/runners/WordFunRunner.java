package com.alex.apcs.projects.ifelse.runners;

import java.util.ArrayList;
import java.util.Iterator;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.WordFun;

public class WordFunRunner extends ApcsProject {

	private static final WordFunRunner instance = new WordFunRunner();
	private static final ArrayList<String> params = new ArrayList<String>();
	
	@Override
	public void execute() {
		WordFun wf = new WordFun("Hello World");
		printLine(wf);
		wf.makeUppercase();
		printLine(wf);
		wf.addHyphen();
		printLine(wf);
		printLine();
		Iterator<String> iter = params.iterator();
		while (iter.hasNext()) {
			wf.setWord(iter.next());
			printLine(wf);
			wf.makeUppercase();
			printLine(wf);
			wf.addHyphen();
			printLine(wf);
			printLine();
		}
	}
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}

	private static final synchronized void init() {
		params.clear();
		params.add("Jim Bob");
		params.add("Computer Science");
		params.add("UIL TCEA");
		params.add("State Champions");
	}
}
