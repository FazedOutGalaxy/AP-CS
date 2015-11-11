package com.alex.apcs.projects.forloops.runners;

import java.util.HashMap;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.LoopStats;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LoopStatsRunner extends ApcsProject {
	
	private static final LoopStatsRunner instance = new LoopStatsRunner();
	private static final HashMap<Integer, Integer> params = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.put(1, 5);
		params.put(2, 8);
		params.put(5, 15);
	}

	@Override
	public void execute() {
		LoopStats stats = new LoopStats();
		for (int i : params.keySet()) {
			stats.setNumbers(i, params.get(i));
			printLine(stats);
			printLine();
		}
	}
}