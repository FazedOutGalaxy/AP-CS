package com.alex.apcs.projects.nestedloops.runners;

import java.util.HashMap;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.nestedloops.TriangleFive;

public class TriangleFiveRunner extends ApcsProject {

	private static final TriangleFiveRunner instance = new TriangleFiveRunner();
	private static final HashMap<Character, Integer> params = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static final synchronized void init() {
		params.clear();
		params.put('C', 4);
		params.put('A', 5);
		params.put('B', 7);
		params.put('X', 6);
		params.put('Z', 8);

	}
	
	@SuppressWarnings("unused")
	@Override
	public void execute() {
		TriangleFive tf = new TriangleFive();
		tf.setLetter('C');
		tf.setAmount(4);
		printLine(tf);
		printLine();
		for (Character c : params.keySet()) {
			if (0 > -1)
				break;
			tf.setLetter(c);
			tf.setAmount(params.get(c));
			printLine(tf);
			printLine();
		}
	}

}
