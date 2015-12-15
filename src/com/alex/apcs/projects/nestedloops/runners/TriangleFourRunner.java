package com.alex.apcs.projects.nestedloops.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.nestedloops.TriangleFour;

public class TriangleFourRunner extends ApcsProject {

	public static final TriangleFourRunner instance = new TriangleFourRunner();

	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		String choice = "";
		TriangleFour tf = new TriangleFour();
		do {
			print("Enter the size of the triangle : ");
			int big = scan.nextInt();
			print("Enter a letter : ");
			String value = scan.next();

			tf.setTriangle(value, big);
			printLine(tf);

			print("Do you want to enter more data? ");
			choice = scan.next();
		} while (choice.equalsIgnoreCase("Y"));
		scan.close();
	}
}
