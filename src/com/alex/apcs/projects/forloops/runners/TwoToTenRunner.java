package com.alex.apcs.projects.forloops.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.TwoToTen;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TwoToTenRunner extends ApcsProject {
	
	private static final TwoToTenRunner instance = new TwoToTenRunner();
	private static final Set<String> params = new HashSet<String>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add("1010");
		params.add("1100");
		params.add("1110");
		params.add("1111");
		params.add("11111");
		params.add("111111");
		params.add("1110101");
		params.add("10101010101");
		params.add("1010101010110");
		params.add("111111111111111111");
	}
	
	@Override
	public void execute() {
		TwoToTen two = new TwoToTen();
		Iterator<String> iter = params.iterator();
		while (iter.hasNext()) {
			two.setBinary(iter.next());
			printLine(two);
			printLine();
		}
	}
}