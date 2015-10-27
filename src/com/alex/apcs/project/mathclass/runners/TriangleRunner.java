package com.alex.apcs.project.mathclass.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.mathclass.Triangle;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TriangleRunner extends ApcsProject {
	
	private static TriangleRunner instance = new TriangleRunner();
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("Give me side 1's length: ");
		double a = scan.nextDouble();
		print("Give me side 2's length: ");
		double b = scan.nextDouble();
		print("Give me side 3's length: ");
		double c = scan.nextDouble();
		scan.close();
		Triangle triangle = new Triangle(a, b, c);
		triangle.print = false;
		triangle.execute();
		printLine(triangle);
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
