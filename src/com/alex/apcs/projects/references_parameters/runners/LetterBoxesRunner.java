package com.alex.apcs.projects.references_parameters.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references_parameters.LetterBoxes;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class LetterBoxesRunner extends ApcsProject {

	private static final LetterBoxesRunner instance = new LetterBoxesRunner();

	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		char c;
		do {
			print("Enter the letter for the box :: ");
			char letter = scan.next().charAt(0);
			print("Enter the size of the box :: ");
			int size = scan.nextInt();
			LetterBoxes.printBox(letter, size);
			printLine();
			print("Do you want to enter more input? ");
			c = scan.next().charAt(0);
			printLine();
		} while (c == 'Y' || c == 'y');
	}
}