package com.alex.apcs.projects.references.advancedoop.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.advancedoop.Monster;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MonsterRunner extends ApcsProject {

	private static final MonsterRunner instance = new MonsterRunner();

	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("Monster 1's name: ");
		String name = scan.next();
		print("Monster 1's size: ");
		int size = scan.nextInt();
		Monster m1 = new Monster(name, size);
		print("Monster 2's name: ");
		String name2 = scan.next();
		print("Monster 2's size: ");
		int size2 = scan.nextInt();
		scan.close();
		Monster m2 = new Monster(name2, size2);
		printLine();
		printLine("Monster 1 - " + m1);
		printLine("Monster 2 - " + m2);
		printLine();
		printLine("Monster one is"
				+ ((m1.isBigger(m2)) ? " bigger " : " smaller ")
				+ "than Monster two.");
		printLine("Monster one"
				+ ((m1.hasSameName(m2, false)) ? " has " : " does not have ")
				+ "the same name as Monster two.");
		scan.close();
	}
}