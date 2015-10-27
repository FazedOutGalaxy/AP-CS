package com.alex.apcs.project.mathclass;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Distance extends ApcsProject {
	
	public boolean print = true;
	private MathLocation a = MathLocation.forCoords(0, 0);
	private MathLocation b = MathLocation.forCoords(0, 0);
	private double distance;
	
	public Distance() {
		this.distance = 0.0D;
	}
	
	public Distance(double x1, double y1, double x2, double y2) {
		this.a = MathLocation.forCoords(x1, y1);
		this.b = MathLocation.forCoords(x2, y2);
	}
	
	public Distance(MathLocation a, MathLocation b) {
		this.a = a;
		this.b = b;
	}
	
	public Distance(UtilParams params) throws IllegalArgumentException {
		try {
			this.a = MathLocation.forCoords(((double) params.read(0)), ((double) params.read(1)));
			this.b = MathLocation.forCoords(((double) params.read(2)), ((double) params.read(3)));
		} catch (Exception ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}

	public synchronized void calculate() {
		this.distance = b.distance(a);
	}
	
	@Override
	public String toString() {
		return "Distance: " + distance;
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
