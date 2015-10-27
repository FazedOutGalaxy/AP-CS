package com.alex.apcs.projects.ifs.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifs.OddOrEven;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class OddOrEvenRunner extends ApcsProject {

	private static final OddOrEvenRunner instance = new OddOrEvenRunner();
	private static boolean runForever = true;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		while(runForever) {
			print("Enter a whole number :: ");
			int number = scan.nextInt();
			printLine(number + " is odd :: " + OddOrEven.isOdd(number));
			printLine(number + " is even :: " + OddOrEven.isEven(number));
			printLine();
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
