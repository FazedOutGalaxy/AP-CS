package com.alex.apcs.projects.whileloops.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.whileloops.Perfect;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class PerfectRunner extends ApcsProject {
	
	private static final PerfectRunner instance = new PerfectRunner();
	private static final Set<Integer> params = new HashSet<Integer>(); 
	
	public static void main(String args[]) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add(496);
		params.add(45);
		params.add(6);
		params.add(14);
		params.add(8128);
		params.add(1245);
		params.add(33);
		params.add(28);
		params.add(27);
		params.add(33550336);
	}

	@Override
	public void execute() {
		Perfect p = new Perfect();
		Iterator<Integer> iter = params.iterator();
		while (iter.hasNext()) {
			p.setNumber(iter.next());
			printLine(p);
			printLine();
		}
	}
}