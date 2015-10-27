package com.alex.apcs.projects.ifs.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifs.Distance;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DistanceRunner extends ApcsProject {

	private static final DistanceRunner instance = new DistanceRunner();
	private static boolean runForever = true;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		while (runForever) {
			print("Enter X1 :: ");
			int x1 = scan.nextInt();
			print("Enter Y1 :: ");
			int y1 = scan.nextInt();
			print("Enter X2 :: ");
			int x2 = scan.nextInt();
			print("Enter Y2 :: ");
			int y2 = scan.nextInt();
			printEmptyLines(2);
			Distance distance = new Distance(x1, y1, x2, y2);
			distance.determineClosest();
			printLine(distance);
			printEmptyLines(3);
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
	
}
