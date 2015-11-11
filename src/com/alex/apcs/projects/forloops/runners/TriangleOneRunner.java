package com.alex.apcs.projects.forloops.runners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.TriangleOne;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TriangleOneRunner extends ApcsProject {
	
	private static final TriangleOneRunner instance = new TriangleOneRunner();
	private static final List<String> params = new ArrayList<String>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static synchronized void init() {
		params.clear();
		params.add("abcd");
		params.add("it");
		params.add("a");
		params.add("chicken");
	}

	@Override
	public void execute() {
		TriangleOne tri = new TriangleOne("hippo");
		tri.execute();
		Iterator<String> iter = params.iterator();
		while (iter.hasNext()) {
			printLine();
			tri.setWord(iter.next());
			tri.execute();
		}
	}
}