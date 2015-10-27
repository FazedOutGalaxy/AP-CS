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
public class Sum extends ApcsProject {
	
	private double a = 0, b = 0, sum = 0;
	private boolean methodA = false;
	private boolean methodB = false;
	
	public Sum(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public synchronized void sum() {
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			this.sum = (a + b);
		}
	}
	
	public synchronized double print() {
		if (methodB) {
			throw new DepletedMethodException("Method was already used!");
		} else {
			methodB = true;
			if (UtilBasicMath.isInt(sum)) {
				printLine(a + " + " + b + " == " + (int) sum);
			} else {
				printLine(a + " + " + b + " == " + sum);
			}
			printLine();
			return sum;
		}
	}

	@Override
	public void execute() {
		sum();
		print();
	}
}
