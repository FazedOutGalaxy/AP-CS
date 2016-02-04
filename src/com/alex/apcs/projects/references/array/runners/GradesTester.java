package com.alex.apcs.projects.references.array.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.array.Grades;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class GradesTester extends ApcsProject {
	
	private static final GradesTester instance = new GradesTester();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Grades test = new Grades("5 - 90 85 95.5 77.5 88");
		printLine(test);
		printLine("sum = " + test.getSum());
		printLine("num grades + " + test.getNumGrades());
		printLine("low grade = " + test.getLowGrade());
		printLine("high grade = " + test.getHighGrade());
	}
}