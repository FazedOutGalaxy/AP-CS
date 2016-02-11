package com.alex.apcs.projects.references.list.runners;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class WordRunner extends ApcsProject {

	private static final WordRunner instance = new WordRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		
	}
}