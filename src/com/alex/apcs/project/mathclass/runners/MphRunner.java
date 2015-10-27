package com.alex.apcs.project.mathclass.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.mathclass.MilesPerHour;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MphRunner extends ApcsProject {
	
	private static MphRunner instance = new MphRunner();
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		print("Give me the amount of miles: ");
		double miles = scan.nextDouble();
		print("Give me the amount of hours: ");
		int hours = scan.nextInt();
		print("Give me the amount of minutes: ");
		float minutes = scan.nextFloat();
		scan.close();
		MilesPerHour mph = new MilesPerHour(miles, hours, minutes);
		mph.print = false;
		mph.execute();
		printLine(mph);
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
