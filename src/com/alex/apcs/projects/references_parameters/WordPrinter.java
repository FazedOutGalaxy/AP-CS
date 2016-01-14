package com.alex.apcs.projects.references_parameters;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class WordPrinter {
	// instance variables and constructors could be present, but are not
	// necessary

	public static void printWord(String word, int times) {
		for (int i = 0; i < Math.abs(times); i++) {
			ApcsProject.pL(word);
		}
	}
}