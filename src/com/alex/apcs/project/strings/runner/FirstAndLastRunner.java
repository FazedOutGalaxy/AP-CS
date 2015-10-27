package com.alex.apcs.project.strings.runner;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.strings.FirstAndLast;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class FirstAndLastRunner extends ApcsProject {

	private static FirstAndLastRunner instance = new FirstAndLastRunner();
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("Word: ");
		String str = scan.next();
		FirstAndLast fal = new FirstAndLast(str);
		fal.print = false;
		fal.execute();
		printLine(fal);
		scan.close();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
