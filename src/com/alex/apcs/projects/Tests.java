package com.alex.apcs.projects;

import java.util.ArrayList;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Tests extends ApcsProject {

	@Override
	public void execute() {
		int x = 4;
		while (x > 0) {
			x -= 1;
			printLine(x);
		}
		printLine();
		printLine();
		int a = 6, sum = 0;
		while (a < 10) {
			a++;
			sum += a;
		}
		print(sum);
		printLine();
		printLine();
		ArrayList<Integer> r = new ArrayList<Integer>();
		add(r, 6);
		add(r, 2);
		add(r, 11);
		add(r, 8);
		set(r, 2, 13);
		remove(r, 0);
		set(r, 1, 3);
		remove(r, 1);
		add(r, 9);
		add(r, 1, 7);
		print(r);
	}
}
