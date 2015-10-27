package com.alex.apcs.project.strings.runner;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.strings.AddStrings;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class AddStringsRunner extends ApcsProject {

	private static AddStringsRunner instance = new AddStringsRunner();
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("Number of words: ");
		int i = scan.nextInt();
		String[] strs = new String[i];
		int a = 0;
		for (int b = 0; b < i; b++) {
			if (a == 0)
				print("First word: ");
			 else if (a == (i - 1))
				print("Last word: ");
			 else
				print("Word " + (a + 1) + ": ");
			strs[a] = scan.next();
			a++;
		}
		AddStrings add = new AddStrings(strs);
		add.print = false;
		add.execute();
		printLine(add);
		scan.close();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
