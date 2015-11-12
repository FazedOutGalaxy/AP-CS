package com.alex.apcs.projects.forloops.runners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.Box;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class BoxRunner extends ApcsProject {
	
	private static final BoxRunner instance = new BoxRunner();
	private static final List<String> params = new ArrayList<String>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add("hippo");
		params.add("abcd");
		params.add("it");
		params.add("a");
		params.add("chicken");
	}
	
	@Override
	public void execute() {
		Box box = new Box();
		Iterator<String> iter = params.iterator();
		while (iter.hasNext()) {
			box.setWord(iter.next());
			box.execute();
		}
	}
}