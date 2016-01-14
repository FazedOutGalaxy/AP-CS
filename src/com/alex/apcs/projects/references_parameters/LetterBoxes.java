package com.alex.apcs.projects.references_parameters;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class LetterBoxes {
	// instance variables and constructors could be present, but are not
	// necessary

	public static void printBox(char letter, int size) {
		for (int a = 0; a < size; a++) {
			for (int b = 0; b < size; b++)
				ApcsProject.p(letter);
			ApcsProject.pL();
		}
	}
}