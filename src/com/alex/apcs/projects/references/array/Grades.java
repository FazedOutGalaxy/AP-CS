package com.alex.apcs.projects.references.array;

/**
 * 
 * @author Alex Chiang
 *
 */
public class Grades {
	private Grade[] grades;

	public Grades(String gradeList) {
		String[] split = gradeList.split("[\\s,]+");
		int size = Integer.parseInt(split[0]);
		grades = new Grade[size];
		for (int i = 2; i < size; i++)
			grades[i - 2] = new Grade(Double.parseDouble(split[i]));
	}

	public void addGrade(double grade) {
		Grade[] old = grades;
		grades = new Grade[old.length + 1];
		for (int i = 0; i < old.length; i++)
			grades[i] = old[i];
		grades[grades.length - 1] = new Grade(grade);
	}

	public void setGrade(int spot, double grade) {
		grades[spot] = new Grade(grade);
	}

	public double getSum() {
		double sum = 0.0;
		for (Grade g : grades) {
			sum += g.getNumericGrade();
		}
		return sum;
	}

	public double getLowGrade() {
		double low = Double.MAX_VALUE;
		for (Grade g : grades) {
			if (g.getNumericGrade() < low)
				low = g.getNumericGrade();
		}
		return low;
	}

	public double getHighGrade() {
		double high = Double.MIN_VALUE;
		for (Grade g : grades) {
			if (g.getNumericGrade() > high)
				high = g.getNumericGrade();
		}
		return high;
	}

	public int getNumGrades() {
		return grades.length;
	}

	public String toString() {
		String output = "";
		return output;
	}
}