package com.alex.apcs.projects.ifs.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifs.LeapYear;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LeapYearRunner extends ApcsProject {

	private static final LeapYearRunner instance = new LeapYearRunner();
	private static boolean runForever = true;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		while(runForever) {
			print("Enter a year :: ");
			int year = scan.nextInt();
			print(year + " is " + ((LeapYear.isLeapYear(year)) ? "" : "NOT ") + "a leap year.");
			printLine();
			printLine();
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
