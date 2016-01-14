package com.alex.apcs.projects.references_parameters.runners;

import java.util.Arrays;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references_parameters.ArrayOfPrimes;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class ArrayOfPrimesRunner extends ApcsProject {

	private static final ArrayOfPrimesRunner instance = new ArrayOfPrimesRunner();

	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		printLine("The 1st 5 primes starting from 2 are :: \n"
				+ Arrays.toString(ArrayOfPrimes.getPrimeList(5)));
		printLine();
		printLine("The 1st 5 primes starting from 10 are :: \n"
				+ Arrays.toString(ArrayOfPrimes.getPrimeList(5, 10)));
		printLine();
		printLine("The 1st 10 primes starting from 100 are :: \n"
				+ Arrays.toString(ArrayOfPrimes.getPrimeList(10, 100)));
	}
}