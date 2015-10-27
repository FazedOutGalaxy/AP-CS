package com.alex.apcs.project.mathclass.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.mathclass.Quadratic;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class QuadraticsRunner extends ApcsProject {
	
	private static QuadraticsRunner instance = new QuadraticsRunner();
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		ApcsProject.p("Enter the leading coefficient of the quadratic: ");
		double a = scan.nextDouble();
		ApcsProject.p("Enter the coefficient of the next lower degree of the quadratic: ");
		double b = scan.nextDouble();
		ApcsProject.p("Enter the constant of the quadratic: ");
		double c = scan.nextDouble();
		scan.close();
		Quadratic quad = new Quadratic(UtilParams.forParams(a, b, c));
		quad.print = false;
		quad.execute();
		printLine(quad);
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
