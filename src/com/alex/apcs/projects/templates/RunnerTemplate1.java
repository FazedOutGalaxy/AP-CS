package com.alex.apcs.projects.templates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;

public class RunnerTemplate1 extends ApcsProject {

	private static final RunnerTemplate1 instance = new RunnerTemplate1();
	private static final Set<String> params = new HashSet<String>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add("");
	}
	
	@Override
	public void execute() {
		
		Iterator<String> iter = params.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}

	

}
