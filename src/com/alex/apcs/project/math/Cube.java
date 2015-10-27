package com.alex.apcs.project.math;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.exceptions.APCSExceptionType;
import com.alex.apcs.exceptions.DepletedMethodException;
import com.alex.apcs.utils.exceptions.UtilException;
import com.alex.apcs.utils.numbers.UtilBasicMath;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Cube extends ApcsProject {
	
	private double side;
	private double area;
	private boolean methodA = false;
	private boolean methodB = false;
	
	public Cube(double side) {
		this.side = side;
	}
	
	public synchronized void calculate() {
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			this.area = 6 * Math.pow(side, 2);
		}
	}
	
	public synchronized double print() {
		if (methodB) {
			throw new DepletedMethodException("Method was already used!");
		} else {
			methodB = true;
			printLine("The surface area is :: " + ((UtilBasicMath.isInt(area)) ? ((int) area) : area));
			printLine();
			return area;
		}
	}

	@Override
	public void execute() {
		calculate();
		print();
	}
}
