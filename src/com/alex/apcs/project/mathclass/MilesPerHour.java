package com.alex.apcs.project.mathclass;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.numbers.UtilBasicMath;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MilesPerHour extends ApcsProject {
	
	public boolean print = true;
	private double miles;
	private int hours;
	private float minutes;
	private double speed;
	
	public MilesPerHour() {
		this.miles = 0.0D;
		this.hours = 0;
		this.minutes = 0.0F;
	}
	
	public MilesPerHour(double miles, int hours, float minutes) {
		this.miles = miles;
		this.hours = hours;
		if (minutes > 60.0D) 
			throw new IllegalArgumentException("Invalid minute time provided! Must be below (or equal to) 60!");
		else
			this.minutes = minutes;
	}
	
	public MilesPerHour(double miles, int hours, double minutes) {
		this.miles = miles;
		this.hours = hours;
		if (minutes > Float.MAX_VALUE || minutes > 60.0D) 
			throw new IllegalArgumentException("Invalid minute time provided! Must be below (or equal to) 60!");
		else
			this.minutes = (float) minutes;
	}
	
	public MilesPerHour(UtilParams params) throws IllegalArgumentException {
		try {
			this.miles = (double) params.read(0);
			this.hours = (int) params.read(1);
			this.minutes = (float) params.read(2);
		} catch (Exception ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}

	public synchronized void calculate() {
		this.speed = miles / (((double) hours) + (minutes / 60.0D));
	}
	
	@Override
	public String toString() {
		boolean mS = UtilBasicMath.isSingular(miles);
		boolean hS = UtilBasicMath.isSingular(hours);
		boolean minS = UtilBasicMath.isSingular(minutes);
		return miles + ((mS) ? " mile" : " miles") + 
				" in " + hours + ((hS) ? " hour" : "hours") + 
				" and " + minutes + ((minS) ? " minute" : "minutes") + 
				" = " + speed + " MPH.";
	}
	
	public void print() {
		printLine(toString());
	}
	
	@Override
	public void execute() {
		 calculate();
		 if (print)
			 print();
	}
}
