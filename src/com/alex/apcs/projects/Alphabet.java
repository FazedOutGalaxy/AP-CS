package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Alphabet extends ApcsProject {

	@Override
	public void execute() {
		char[] ca = new char[26];
		for (int i = 65; i < 91; i++) {
			ca[i - 65] = (char) i;
		}
		for (char c : ca) {
			if (ca[ca.length - 1] == c) print(c);
			else print(c + ", ");
		}
	}

}
