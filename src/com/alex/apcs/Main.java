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
		Object[] obj = new Object[3];
		for (int i = 0; i < obj.length; i++) {
			out.println(obj[i]);
		}
	}
	
	public static void pr(boolean newLine, String str) {
		if (newLine) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
}
