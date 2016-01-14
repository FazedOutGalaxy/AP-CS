package com.alex.apcs.projects.references_parameters.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references_parameters.WordPrinter;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class WordPrinterRunner extends ApcsProject {
	
	private static final WordPrinterRunner instance = new WordPrinterRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		
		Scanner keyboard = new Scanner(System.in);
		char choice;
		do {
			print("\nEnter the word to display :: ");
			String word = keyboard.next();

			print("Enter the times to display :: ");
			int times = keyboard.nextInt();

			WordPrinter.printWord(word, times);

			print("\nDo you want to enter more sample input? ");
			
			choice = keyboard.next().charAt(0);
		} while (choice == 'Y' || choice == 'y');
	}
}