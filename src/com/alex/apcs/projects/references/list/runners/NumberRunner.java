package com.alex.apcs.projects.references.list.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.list.Number;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberRunner extends ApcsProject {

	private static final NumberRunner instance = new NumberRunner();

	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		int[] nums = { 7, 28, 496, 1111, 199, 201, 17 };
		for (int num : nums) {
			Number one = new Number(num);
			printLine(one.isOdd() ? one + " is odd.\n" : one
					+ " is not odd.\n");
			printLine(one.isPerfect() ? one + " is perfect.\n" : one
					+ " is not perfect.\n");
		}
	}
}