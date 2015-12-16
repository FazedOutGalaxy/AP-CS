package com.alex.apcs.projects.sortsearch.runners;

import java.io.IOException;
import java.util.Arrays;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.sortsearch.NumberShifter;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberShifterRunner extends ApcsProject {
	
	private static final NumberShifterRunner instance = new NumberShifterRunner();
	
	public static void main(String args[]) throws IOException {
		instance.execute();
	}
	
	@Override
	public void execute() {
		for (int i = 0; i < 1; i++) {
			int[] array = NumberShifter.makeLucky7Array(20);
			printLine(Arrays.toString(array));
			NumberShifter.shiftEm(array);
			printLine(Arrays.toString(array));
		}
	}
}
