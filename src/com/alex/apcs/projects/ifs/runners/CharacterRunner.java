package com.alex.apcs.projects.ifs.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifs.CharacterAnalyzer;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CharacterRunner extends ApcsProject {

	private static final CharacterRunner instance = new CharacterRunner();
	private static boolean runForever = true;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		while (runForever) {
			print("Enter a letter :: ");
			char c = scan.next().charAt(0);	
			CharacterAnalyzer ca = new CharacterAnalyzer(c);
			print(ca);
			printLine();
		}
		scan.close();
	}

	public static void main(String[] args) {
		instance.execute();
	}

}
