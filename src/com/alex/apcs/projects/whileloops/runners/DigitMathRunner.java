package com.alex.apcs.projects.whileloops.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.whileloops.DigitMath;

public class DigitMathRunner extends ApcsProject {

	private static final DigitMathRunner instance = new DigitMathRunner();
	private static final Set<Integer> params = new HashSet<Integer>();
	
	public static void main(String[] args) {
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
		params.add(8574);
		params.add(123456789);
	}
	
	@Override
	public void execute() {
		Iterator<Integer> iter = params.iterator();
		while (iter.hasNext()) {
			int next = iter.next();
			printLine(next + " has a digit average of " + DigitMath.averageDigits(next));
		}
	}
}
