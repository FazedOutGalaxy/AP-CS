package com.alex.apcs.project.math;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.exceptions.APCSExceptionType;
import com.alex.apcs.exceptions.DepletedMethodException;
import com.alex.apcs.instantiatables.Graphics2DSize;
import com.alex.apcs.utils.exceptions.UtilException;
import com.alex.apcs.utils.numbers.UtilBasicMath;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Rectangle extends ApcsProject {
	
	private double a = 0, b = 0;
	private boolean methodA = false;
	private boolean methodB = false;
	private double permimeter;
	private double area = -1.0D;
	private boolean calcArea = false;
	
	public Rectangle(double length, double width, boolean calcArea) {
		this.a = length;
		this.b = width;
		this.calcArea = calcArea;
		if (UtilBasicMath.isNegative(a) ||
				UtilBasicMath.isNegative(b)) {
			throw new IllegalArgumentException("Arguments must be positive!");
		}
	}
	
	public Rectangle(Graphics2DSize size, boolean calcArea) {
		this.a = size.getWidth();
		this.b = size.getHeight();
		this.calcArea = calcArea;
		if (UtilBasicMath.isNegative(a) ||
				UtilBasicMath.isNegative(b)) {
			throw new IllegalArgumentException("Arguments must be positive!");
		}
	}
	
	public synchronized void perimeter() {
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			this.permimeter = (2 * a) + (2 * b);
		}
	}
	
	public synchronized void area() {
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			this.area = a * b;
		}
	}
	
	public synchronized void print() {
		if (methodB) {
			throw new DepletedMethodException("Method was already used!");
		} else {
			methodB = true;
			printLine("The perimeter is :: " + permimeter);
			if (UtilBasicMath.isPositive(area)) {
				printLine("The area is :: " + (((UtilBasicMath.isInt(area)) ? ((int) area) : (area))));
			}
			printLine();
		}
	}

	@Override
	public void execute() {
		perimeter();
		if (calcArea) {
			area();
		}
		print();
	}
}
