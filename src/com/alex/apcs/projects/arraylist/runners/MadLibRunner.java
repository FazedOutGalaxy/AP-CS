package com.alex.apcs.projects.arraylist.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arraylist.MadLib;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MadLibRunner extends ApcsProject {
	
	private static final MadLibRunner instance = new MadLibRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		printLine("\n");
		MadLib ml = new MadLib();
		printLine(ml);
	}
}