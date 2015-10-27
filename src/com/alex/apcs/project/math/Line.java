package com.alex.apcs.project.math;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.exceptions.APCSExceptionType;
import com.alex.apcs.exceptions.DepletedMethodException;
import com.alex.apcs.project.mathclass.MathLocation;
import com.alex.apcs.utils.exceptions.UtilException;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Line extends ApcsProject {
	
	private MathLocation loc1;
	private MathLocation loc2;
	private double slope;
	private boolean methodA = false;
	private boolean methodB = false;
	
	public Line(double x1, double y1, double x2, double y2) {
		this.loc1 = MathLocation.forCoords(x1, y1);
		this.loc2 = MathLocation.forCoords(x2, y2);
	}
	
	public Line(UtilParams params, boolean locations) throws IllegalArgumentException {
		try {
			if (locations) {
				this.loc2 = (MathLocation) params.read(1);
				this.loc1 = (MathLocation) params.read(0);
			} else {
				this.loc1 = MathLocation.forCoords((double) params.read(0), (double) params.read(1));
				this.loc2 = MathLocation.forCoords((double) params.read(2), (double) params.read(3));
			}
		} catch (ClassCastException ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}
	
	public Line(MathLocation loc1, MathLocation loc2) {
		this.loc2 = loc2;
		this.loc1 = loc1;
	}
	
	public synchronized void calculate() {
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			this.slope = (loc2.getY() - loc1.getY()) / (loc2.getX() - loc1.getX());
		}
	}
	
	public synchronized double print() {
		if (methodB) {
			throw new DepletedMethodException("Method was already used!");
		} else {
			methodB = true;
			printLine("The slope is " + slope);
			printLine();
			return slope;
		}
	}

	@Override
	public void execute() {
		calculate();
		print();
	}
}
