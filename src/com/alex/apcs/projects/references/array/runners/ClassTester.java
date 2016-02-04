package com.alex.apcs.projects.references.array.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.array.*;
import com.alex.apcs.projects.references.array.Class;

/**
 * 
 * @author Alex Chiang
 *
 */
public class ClassTester extends ApcsProject {

	private static final ClassTester instance = new ClassTester();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		Class test = new Class("Comp Sci 1", 3);
		test.addStudent(0, new Student("Jimmy", "4 - 100 90 80 60"));
		test.addStudent(1, new Student("Sandy", "4 - 100 100 80 70"));
		test.addStudent(2, new Student("Fred", "4 - 50 50 70 68"));
		printLine(test);

		printLine(String.format(test.getStudentName(0) + "\'s average = %.2f",
				test.getStudentAverage(0)));
		printLine(String.format(test.getStudentName(1) + "\'s average = %.2f",
				test.getStudentAverage(1)));
		printLine(String.format(test.getStudentName(2) + "\'s average %.2f",
				test.getStudentAverage(2)));

		printLine(String.format("Sandy" + "\'s average %.2f",
				test.getStudentAverage("Sandy")));

		printLine("Failure List = " + test.getFailureList(70));
		printLine("Highest Average = " + test.getStudentWithHighestAverage());
		printLine("Lowest Average = " + test.getStudentWithLowestAverage());

		printLine(String.format("Class Average = %.2f", test.getClassAverage()));
	}
}