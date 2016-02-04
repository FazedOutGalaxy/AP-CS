package com.alex.apcs.projects.references.array.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class GradeBookRunner extends ApcsProject {

	private static final GradeBookRunner instance = new GradeBookRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		printLine("Welcome to the Class Stats program!");

		Scanner keyboard = new Scanner(System.in);

		keyboard.close();
	}
}