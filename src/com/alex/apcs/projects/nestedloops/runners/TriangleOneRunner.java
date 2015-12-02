package com.alex.apcs.projects.nestedloops.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.nestedloops.TriangleOne;

public class TriangleOneRunner extends ApcsProject {

	public static final TriangleOneRunner instance = new TriangleOneRunner();

	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		String choice = "";
		do{
			print("Enter the size of the triangle : ");
			int big = scan.nextInt();
			print("Enter a letter : ");
			String value = scan.next();

			printLine(TriangleOne.createTriangle(big, value));

			print("Do you want to enter more data? ");
			choice = scan.next();
		} while (choice.equals("Y") || choice.equals("y"));
	}
	
	
}
