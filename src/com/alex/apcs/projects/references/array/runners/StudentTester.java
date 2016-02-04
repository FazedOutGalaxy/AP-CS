package com.alex.apcs.projects.references.array.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.array.Student;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class StudentTester extends ApcsProject {
	
	private static final StudentTester instance = new StudentTester();
	
	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		Student stu = new Student("Billy Bob", "5 - 90 85 95.5 77.5 88");
		printLine(stu);
		printLine("sum = " + stu.getSum());
		printLine("average = " + stu.getAverage());
		printLine("average after dropping low grade = "
				+ stu.getAverageMinusLow());
		printLine("low grade = " + stu.getLowGrade());
		printLine("high grade = " + stu.getHighGrade());
	}
}