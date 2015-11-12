package com.alex.apcs.projects.forloops.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.Prime;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class PrimeRunner extends ApcsProject {
	
	private static final PrimeRunner instance = new PrimeRunner();
	private static final Set<Integer> params = new HashSet<Integer>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.add(24);
		params.add(7);
		params.add(100);
		params.add(113);
		params.add(65535);
		params.add(2);
		params.add(7334);
		params.add(7919);
		params.add(1115125003);
	}
	
	@Override
	public void execute() {
		Prime prime = new Prime();
		Iterator<Integer> iter = params.iterator();
		while (iter.hasNext()) {
			prime.setNumber(iter.next());
			printLine(prime);
			printLine();
		}
	}
}