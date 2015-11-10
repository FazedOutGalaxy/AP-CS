package com.alex.apcs.projects.forloops.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.VowelCounter;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class VowelCounterRunner extends ApcsProject {
	
	private static final VowelCounterRunner instance = new VowelCounterRunner();
	
	@Override
	public void execute() {
		System.out.println(VowelCounter.getNumberString("abcdef"));
		System.out.println(VowelCounter.getNumberString("hhhhhhh"));
		System.out.println(VowelCounter.getNumberString("aaaaaaa"));
		System.out.println(VowelCounter
				.getNumberString("catpigdatrathogbogfrogmoosegeese"));
		System.out
				.println(VowelCounter.getNumberString("hhhhhhh1234356HHHHDH"));
		System.out.println(VowelCounter
				.getNumberString("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj"));
		System.out.println(VowelCounter.getNumberString(""));
		System.out.println(VowelCounter.getNumberString("x"));
		System.out.println(VowelCounter.getNumberString("e"));
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
