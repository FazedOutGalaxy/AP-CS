package com.alex.apcs.projects.forloops.runners;

import java.util.HashMap;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.MultTable;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MultTableRunner extends ApcsProject {
	
	private static final MultTableRunner instance = new MultTableRunner();
	private static final HashMap<Integer, Integer> params = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.put(5, 5);
		params.put(3, 7);
		params.put(1, 6);
		params.put(9, 9);
		params.put(7, 8);
	}
	
	@Override
	public void execute() {
		MultTable table = new MultTable();
		for (int i : params.keySet()) {
			table.setTable(i, params.get(i));
			table.execute();
		}
	}
}