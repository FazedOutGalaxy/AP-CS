package com.alex.apcs.projects.ifelse;

import com.alex.apcs.abstracts.ApcsProject;

public class Social extends ApcsProject {

	private String socialNumber;
	private int[] numbers = new int[3];
	private int sum = 0;
	
	public Social(String socialNumber) {
		setSocialNumber(socialNumber);
	}
	
	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
		sum = 0;
	}
	
	@Override
	public void execute() {
		String[] split = socialNumber.split("-");
		this.numbers[0] = Integer.parseInt(split[0]);
		this.numbers[1] = Integer.parseInt(split[1]);
		this.numbers[2] = Integer.parseInt(split[2]);
		for (int i : numbers) {
			sum += i;
		}
	}
	
	@Override
	public String toString() {
		return "SS# " + socialNumber + " has a total of " + sum + "\n";
	}
	
	public String getString() { return socialNumber; }
	public int[] getNumbers() { return numbers; }
	public int getSum() { return sum; }
	
}
