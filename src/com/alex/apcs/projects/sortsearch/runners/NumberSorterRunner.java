package com.alex.apcs.projects.sortsearch.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.sortsearch.NumberSorter;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberSorterRunner extends ApcsProject {
	
	private static final NumberSorterRunner instance = new NumberSorterRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		int[] cases = { 567891, 901912468, 864213507, 898777, 234422 };
		for (int test : cases) {
			int[] one = NumberSorter.getSortedDigitArray(test);
			for (int item : one) {
				print(item + " ");
			}
			printLine();
		}
	}
}