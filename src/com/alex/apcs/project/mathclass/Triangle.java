package com.alex.apcs.project.mathclass;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Triangle extends ApcsProject {
	
	public boolean print = true;
	private double a, b, c, area;
	
	public Triangle() {
		set(0.0D, 0.0D, 0.0D);
		init();
	}
	
	public Triangle(double a, double b, double c) {
		set(a, b, c);
		init();
	}
	
	public Triangle(UtilParams params) throws IllegalArgumentException {
		try {
			this.a = (double) params.read(0);
			this.b = (double) params.read(1);
			this.c = (double) params.read(2);
		} catch (Exception ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}
	
	private synchronized void init() {
		this.area = 0.0D;
	}
	
	public void set(UtilParams params) {
		if (params.length == 1) {
			this.a = (double) params.read(0);
		} else if (params.length == 2) {
			this.a = (double) params.read(0);
			this.b = (double) params.read(1);
		} else if (params.length == 3) {
			this.a = (double) params.read(0);
			this.b = (double) params.read(1);
			this.c = (double) params.read(2);
		}
	}

	public void set(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public synchronized void calculate() {
		double perim = a + b + c;
		double s = perim / 2;
		this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	@Override
	public String toString() {
		return "Area = " + area;
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
