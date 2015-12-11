package com.alex.apcs.projects.arrays.runners;

import java.util.Arrays;
import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arrays.OddsAndEvens;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class OddAndEvensRunner extends ApcsProject {
	
	private static final OddAndEvensRunner instance = new OddAndEvensRunner();
	private static final int[][] params = new int[3][];
	
	public static void main(String args[]) {
		params[0] = new int[] {2, 4, 6, 8, 10, 12, 14};
		params[1] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		params[2] = new int[] {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		instance.execute();
	}
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("How many arrays would you like to enter? ");
		int arrayCount = scan.nextInt();
		print("Enter each array integer seperated with a \",\" or \", \".\n");
		int[][] arrays = new int[arrayCount][];
		boolean done = false;
		for (int i = 1; i <= arrayCount; i++) {
			print("Array " + i + ": ");
			if (!done) {
				scan.nextLine();
				done = true;
			}
			String next = scan.nextLine();
			String[] ar = next.split(",[\\s]*");
			int[] arr = new int[ar.length];
			for (int a = 0; a < ar.length; a++) {
				arr[a] = Integer.parseInt(ar[a]);
			}
			arrays[i - 1] = arr;
		}
		scan.close();
		printEmptyLines(5);
		printLine("/* Preset Sample Data */");
		printLine();
		for (int[] array : params) {
			printLine("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array)));
			printLine("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(array)));
			printLine();
		}
		printLine("/* User Input Data */");
		printLine();
		for (int[] array : arrays) {
			printLine("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array)));
			printLine("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(array)));
			printLine();
		}
	}
}