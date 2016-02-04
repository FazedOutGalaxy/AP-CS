package com.alex.apcs.projects.references.array;

/**
 * 
 * @author Alex Chiang
 *
 */
public class Grade {
	
	private double value;

	public Grade() {
		this(0.0D);
	}
	
	public Grade(double value) {
		setValue(value);
	}
	
	// add in set and get methods
	public void setValue(double value) {
		this.value = value;
	}
	
	// String getLetterGrade()
	public char getLetterGrade() {
		if (value >= 90.0D)
			return 'A';
		else if (value < 90.0D && value >= 80.0D)
			return 'B';
		else if (value < 80.0D && value >= 70.0D)
			return 'C';
		else if (value < 70.0D && value >= 60.0D) 
			return 'D';
		else
			return 'F';
	}
	
	// double getNumericGrade()
	public double getNumericGrade() {
		return value;
	}

	// toString method
	@Override
	public String toString() {
		return "idek";
	}
}
