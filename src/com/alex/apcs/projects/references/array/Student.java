package com.alex.apcs.projects.references.array;

/**
 * 
 * @author Alex Chiang
 *
 */
public class Student {
	private String name;
	private Grades grades;

	public Student() {
		this("Alex", "10 - 100 100 100 100 101 100 100 100 100 102");
	}

	public Student(String name, String grades) {
		setStudent(name, grades);
	}

	public void setStudent(String name, String grades) {
		setName(name);
		setGrades(grades);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGrades(String grades) {
		this.grades = new Grades(grades);
	}

	public void setGrade(int spot, double grade) {

	}

	public String getName() {
		return name;
	}

	public int getNumGrades() {
		return grades.getNumGrades();
	}

	public double getSum() {
		return grades.getSum();
	}

	public double getAverage() {
		return grades.getSum() / grades.getNumGrades();
	}

	public double getAverageMinusLow() {
		return getAverage() - grades.getLowGrade();
	}

	public double getHighGrade() {
		return grades.getHighGrade();
	}

	public double getLowGrade() {
		return grades.getLowGrade();
	}

	public String toString() {
		return "";
	}
}