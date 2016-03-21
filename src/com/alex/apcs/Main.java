package com.alex.apcs;

import java.io.PrintStream;
import java.util.Arrays;

import com.alex.apcs.Beta;
import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
@SuppressWarnings("unused")
public class Main {

	private static int total;
	private static final PrintStream out = System.out;
	
	public static void main(String[] args) {
		run(1);
	}
	
	public static void run(int i) {
		ApcsProject.pL("Recursion run " + i);
		run(++i);
	}
	
	public static void pr(boolean newLine, String str) {
		if (newLine) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
}
