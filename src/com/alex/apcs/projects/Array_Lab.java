package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Array_Lab extends ApcsProject {

	private static ApcsProject instance = new Array_Lab();
	
	public Array_Lab() {
		instance = this;
	}
	
	@Override
	public void execute() {
		int[] rayOne = new int[15];
		int i = 0;
		int a = 2;
		while (i != 10) {
			rayOne[i] = a;
			a++;
			i++;
		}
		a = 2;
		while (i != 14) {
			rayOne[i] = a;
			a++;
			i++;
		}
		rayOne[14] = 3;
		rayOne[8] = 0;
		for (int b = 0; b < (rayOne.length); b += 2) {
			print("" + rayOne[b] + " ");
		}
		printLine(" ");
		for (int c = (rayOne.length - 1); c > -1; c--) {
			print("" + rayOne[c] + " ");
		}
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
