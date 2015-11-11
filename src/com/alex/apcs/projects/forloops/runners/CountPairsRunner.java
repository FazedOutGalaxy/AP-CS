package com.alex.apcs.projects.forloops.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.forloops.CountPairs;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CountPairsRunner extends ApcsProject {
	
	private static final CountPairsRunner instance = new CountPairsRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		printLine(CountPairs.pairCounter("test_cases"));
		// add in all of the provided test cases from the lab handout
		printLine(CountPairs.pairCounter("ddogccatppig"));
		printLine(CountPairs.pairCounter("dogcatpig"));
		printLine(CountPairs.pairCounter("xxyyzz"));
		printLine(CountPairs.pairCounter("a"));
		printLine(CountPairs.pairCounter("abc"));
		printLine(CountPairs.pairCounter("aabb"));
		printLine(CountPairs.pairCounter("dogcatpigaabbcc"));
		printLine(CountPairs.pairCounter("aabbccdogcatpig"));
		printLine(CountPairs.pairCounter("dogabbcccatpig"));
		printLine(CountPairs.pairCounter("aaaa"));
		printLine(CountPairs.pairCounter("AAAAAAAAA"));
	}
}