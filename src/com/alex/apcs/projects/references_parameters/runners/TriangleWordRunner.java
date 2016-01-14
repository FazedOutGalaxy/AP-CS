package com.alex.apcs.projects.references_parameters.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references_parameters.TriangleWord;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class TriangleWordRunner extends ApcsProject {
	
	private static final TriangleWordRunner instance = new TriangleWordRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		char c;
		boolean firstRun = true;
		do {
			if (!firstRun)
				printLine();
			print("Enter a word :: ");
			TriangleWord.printTriangle(scan.next());
			
			printLine();
			print("Do you want to enter more sample input? ");
			
			c = scan.next().charAt(0);
			firstRun = false;
		} while (c == 'Y' || c == 'y');
	}
}