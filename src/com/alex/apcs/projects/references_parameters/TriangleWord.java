package com.alex.apcs.projects.references_parameters;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class TriangleWord {
	// instance variables and constructors could be present, but are not
	// necessary

	public static void printTriangle(String word) {
		int a = 1;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < a; j++) {
				ApcsProject.p(word.substring(0, a));
			}
			ApcsProject.pL();
			a++;
		}
	}
}