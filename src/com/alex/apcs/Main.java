package com.alex.apcs;

import java.io.PrintStream;

import com.alex.apcs.Beta;

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
		String x = "abcdef";
		String y = x;
		x = null;
		out.println(y);
	}
	
	public static void pr(boolean newLine, String str) {
		if (newLine) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
}
