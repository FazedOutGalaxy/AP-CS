package com.alex.apcs.projects.whileloops.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.whileloops.StringRemover;

@SuppressWarnings("unused")
public class StringRemoverRunner extends ApcsProject {

	private static final StringRemoverRunner instance = new StringRemoverRunner();
	private static final Set<String> params = new HashSet<String>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add("xR");
	}
	
	@Override
	public void execute() {
		StringRemover sr = new StringRemover();
		sr.setRemover("xR-MxR-MHelloxR-M", "R-M");
		printLine(sr);
		sr.setRemover("sxsssxssxsxsxssexssxsesss", "xs");
		printLine(sr);
		sr.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
		printLine(sr);
	}

	

}
