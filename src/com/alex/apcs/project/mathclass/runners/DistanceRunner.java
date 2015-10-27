package com.alex.apcs.project.mathclass.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.mathclass.Distance;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DistanceRunner extends ApcsProject {
	
	private static DistanceRunner instance = new DistanceRunner();
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("Give me an x1 value: ");
		double x1 = scan.nextDouble();
		print("Give me an y1 value: ");
		double y1 = scan.nextDouble();
		print("Give me an x2 value: ");
		double x2 = scan.nextDouble();
		print("Give me an y2 value: ");
		double y2 = scan.nextDouble();
		scan.close();
		Distance distance = new Distance(UtilParams.forParams(x1, y1, x2, y2));
		distance.print = false;
		distance.execute();
		printLine(distance);
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
