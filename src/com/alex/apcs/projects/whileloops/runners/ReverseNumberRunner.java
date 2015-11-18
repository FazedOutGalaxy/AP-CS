package com.alex.apcs.projects.whileloops.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.whileloops.ReverseNumber;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ReverseNumberRunner extends ApcsProject {
	
	private static final ReverseNumberRunner instance = new ReverseNumberRunner();
	private static final Set<Integer> params = new HashSet<Integer>();
	
	public static void main(String args[]) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add(234);
		params.add(10000);
		params.add(111);
		params.add(9005);
		params.add(84645);
		params.add(8547);
		params.add(123456789);
	}

	@Override
	public void execute() {
		ReverseNumber rn = new ReverseNumber();
		Iterator<Integer> iter = params.iterator();
		while (iter.hasNext()) {
			rn.setNumber(iter.next());
			printLine(rn);
			printLine();
		}
	}
}