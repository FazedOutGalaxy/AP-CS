package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class AsciiBox extends ApcsProject {

	private static ApcsProject instance = new AsciiBox();
	
	public AsciiBox() {
		instance = this;
	}
	
	@Override
	public void execute() {
		printLine("Alex Chiang \t  9/15/2015 \n\n" );
		boolean a = true;
		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < 3; x++) {
				if (a) {
					printLine("+++++++++++++++++++++++++");
				} else {
					printLine("AAAAAAAAAAAAAAAAAAAAAAAAA");
				}
				if (x == 2) {
					if (a) {
						a = false;
					} else {
						a = true;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
