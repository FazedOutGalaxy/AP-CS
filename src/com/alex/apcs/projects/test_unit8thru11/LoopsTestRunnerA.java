package com.alex.apcs.projects.test_unit8thru11;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LoopsTestRunnerA extends ApcsProject {
	
	private static final LoopsTestRunnerA instance = new LoopsTestRunnerA();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		LoopsTestA lta = new LoopsTestA();
		do {
			print("Enter your word : ");
			String text = keyboard.next();

			// instantiate a LoopsTestA object with the text parameter
			lta.setWord(text);
			// print the LoopsTestA object which will automatically call
			// the toString method to print the letters from the word
			// as shown in the word document
			printLine(lta);
			
			print("Do you want to enter more data? ");
			choice = keyboard.next();
		} while (choice.equalsIgnoreCase("Y"));
		keyboard.close();
	}
}