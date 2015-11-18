package com.alex.apcs.projects.templates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;

public class RunnerTemplate2 extends ApcsProject {

	private static final RunnerTemplate2 instance = new RunnerTemplate2();
	private static final Set<Integer> params = new HashSet<Integer>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add(0);
	}
	
	@Override
	public void execute() {
		
		Iterator<Integer> iter = params.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}
}
