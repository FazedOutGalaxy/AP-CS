package com.alex.apcs.project.mathclass;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Quadratic extends ApcsProject {

	public boolean print = true;
	private double a, b, c, root1, root2;
	
	public Quadratic() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Quadratic(UtilParams params) throws IllegalArgumentException {
		try {
			this.a = (double) params.read(0);
			this.b = (double) params.read(1);
			this.b = (double) params.read(2);
		} catch (Exception ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}

	public synchronized void calculate() {
		double denom = 2 * a;
		double sqrt = Math.sqrt(Math.pow(b, 2.0D) - (4 * a * c));
		this.root1 = (-b + sqrt) / denom;
		this.root2 = (-b - sqrt) / denom;
	}
	
	@Override
	public String toString() {
		return "Root one: " + root1 + "\n" + "Root two: " + root2;
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
