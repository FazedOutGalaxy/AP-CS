package com.alex.apcs.projects.switchcase.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.switchcase.Monster;

public class MonsterRunner extends ApcsProject {
	
	private static final MonsterRunner instance = new MonsterRunner();
	private static boolean runForever = true;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		while (runForever) {
			print("Enter 1st monster's name : ");
			String n1 = scan.next();
			print("Enter 1st monster's size : ");
			Monster m1 = new Monster(n1, scan.nextInt());
			print("Enter 2nd monster's name : ");
			String n2 = scan.next();
			print("Enter 2nd monster's size : ");
			Monster m2 = new Monster(n2, scan.nextInt());
			doIt(m1, m2);
			printEmptyLines(3);
		}
		scan.close();
	}
	
	private void doIt(Monster m1, Monster m2) {
		printLine();
		printLine("Monster 1 - " + m1);
		printLine("Monster 2 - " + m2);
		printLine();
		if (m1.isBigger(m2))
			printLine("Monster one is bigger than Monster two.");
		else if (m1.getSize() == m2.getSize()) 
			printLine("Monster one is the same size as Monster two.");
		else
			printLine("Monster one is smaller than Monster two.");
		printLine(m1.hasSameName(m2, true) ? "Monster one has the same name as Monster two." : "Monster one does not have the same name as Monster two.");
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}