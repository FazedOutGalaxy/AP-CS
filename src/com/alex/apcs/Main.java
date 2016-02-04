package com.alex.apcs;

import java.io.PrintStream;
import java.util.Arrays;

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
		int[] b = new int[3];
		int[] c = b;
		c[0] = 3;
		out.println(b[0]);
	}
	
	public static void pr(boolean newLine, String str) {
		if (newLine) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
}
