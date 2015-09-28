package com.alex.apcs.projects;

import java.util.ArrayList;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ArrayList_Lab extends ApcsProject {

	private static ApcsProject instance = new ArrayList_Lab();
	
	public ArrayList_Lab() {
		instance = this;
	}
	
	@Override
	public void execute() {
		ArrayList<Integer> r = new ArrayList<Integer>();
		add(r, 5);
		add(r, 22);
		add(r, 3);
		add(r, 13);
		remove(r, 2);
		set(r, 1, 30);
		print("" + r);
		remove(r, 1);
		print("" + r);
		add(r, -5);
		print("" + r);
		add(r, 1, 7);
		print("" + r);
		remove(r, 0);
		printLine("Mod: " + ((r.get(1)) % (r.get(0))));
		printLine("Sum: " + (((Integer) get(r, 1)) + ((Integer) get(r, 2))));
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
