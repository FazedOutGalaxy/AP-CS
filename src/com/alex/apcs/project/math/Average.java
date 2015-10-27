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
public class Average extends ApcsProject {
	
	private double[] numbers;
	private double avg = 0;
	private boolean methodA = false;
	private boolean methodB = false;
	
	public Average(double a, double b) {
		this.numbers = new double[2];
		numbers[0] = a;
		numbers[1] = b;
	}
	
	public Average(double... numbers) {
		this.numbers = numbers;
	}
	
	public synchronized void average() {
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			double sum = 0.0D;
			for (double a : numbers) {
				sum += a;
			}
			this.avg = (sum / numbers.length);
		}
	}
	
	public synchronized double print() {
		if (methodB) {
			throw new DepletedMethodException("Method was already used!");
		} else {
			methodB = true;
			String str = "";
			int a = 0;
			for (double i : numbers) {
				if (a == numbers.length - 1) {
					if (UtilBasicMath.isInt(i)) {
						str += ((int) i);
					} else {
						str += i;
					}
				} else {
					if (UtilBasicMath.isInt(i)) {
						str += ((int) i) + " + ";
					} else {
						str += i + " + ";
					}
				}
				a++;
			}
			printLine(str + " has an average of " + avg);
			printLine();
			return avg;
		}
	}

	@Override
	public void execute() {
		average();
		print();
	}
}
