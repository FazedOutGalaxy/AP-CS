package com.alex.apcs.projects.matricies;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ForestRunner extends ApcsProject {

	private static final ForestRunner instance = new ForestRunner();

	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		for (int i = 0; i < 3; i++) {
			Forest woods = new Forest(7, 5);
			printLine(woods + "\n\n");
			printLine(woods.setTrappedToNull() + "\n\n");
			printLine(woods + "\n\n");
		}
	}
}
