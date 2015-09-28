package com.alex.apcs.projects.oop;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * @version 1.0
 *
 */
public class StarsAndStripes extends ApcsProject {
	
	private static StarsAndStripes instance = new StarsAndStripes();
	private String str = "";
	
	public StarsAndStripes() { }
	
	private synchronized void init() {
		for (int i = 0; i < 20; i++) {
			str += "_";
		}
	}

	@Override
	public void execute() {
		printLine("StarsAndStripes");
		printTwoBlankLines();
		init();
		printSmallBox();
		printTwoBlankLines();
		printBigBox();
	} 
   
	public void printStars() {
		printLine(str.replace("_", "*"));
	}

	public void printDashes() {
		printLine(str.replace("_", "-"));
	}

	public void printTwoBlankLines() {
	   printLine();
	   printLine();
	}
   
	public void printSmallBox() {	
	   for (int i = 0; i < 3; i++) {
		   printDashes();
		   printStars();
	   }
	   printDashes();
	} 
 
	public void printBigBox() { 	
	   printSmallBox();
	   printSmallBox();
	}
   
	public static void main(String[] args) {
		instance.execute();
	}
   
}