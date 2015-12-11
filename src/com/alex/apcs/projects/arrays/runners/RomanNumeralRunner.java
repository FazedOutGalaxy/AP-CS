package com.alex.apcs.projects.arrays.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arrays.RomanNumeral;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class RomanNumeralRunner extends ApcsProject {
	
	private static final RomanNumeralRunner instance = new RomanNumeralRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		RomanNumeral test = new RomanNumeral(10);
		printLine("10 is " + test.toString());

		test.setNumber(100);
		printLine("100 is " + test.toString());

		test.setNumber(1000);
		printLine("1000 is " + test.toString());

		test.setNumber(2500);
		printLine("2500 is " + test.toString());

		test = new RomanNumeral(1500);
		printLine("1500 is " + test.toString());

		test.setNumber(23);
		printLine("23 is " + test.toString());

		test.setNumber(38);
		printLine("38 is " + test.toString());

		test.setNumber(49);
		printLine("49 is " + test.toString());

		test.setRoman("LXXVII");
		printLine("LXXVII is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		printLine("XLIX is " + test.getNumber() + "\n");

		test.setRoman("XX");
		printLine("XX is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		printLine("XLIX is " + test.getNumber() + "\n");
	}
}