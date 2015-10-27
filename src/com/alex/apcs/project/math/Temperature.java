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
public class Temperature extends ApcsProject {
	
	private double unit;
	private TemperatureType type;
	private TemperatureType desire = null;
	private double converted;
	private boolean methodA = false;
	private boolean methodB = false;
	
	public Temperature(double unit, TemperatureType type) {
		this.unit = unit;
		this.type = type;
	}
	
	public Temperature(double unit, TemperatureType type, TemperatureType desiredConversion) {
		this.unit = unit;
		this.type = type;
		this.desire = desiredConversion;
	}
	
	public synchronized void calculate(TemperatureType convert) {
		this.desire = convert;
		if (type == convert) {
			throw new IllegalArgumentException("Initial unit already in that type!");
		}
		if (methodA) {
			UtilException.throwException(APCSExceptionType.DEPLETED_METHOD, "Method was already used!");
		} else {
			methodA = true;
			if (type == TemperatureType.FAHRENHEIT) {
				if (convert == TemperatureType.CELSIUS) {
					this.converted = (unit - 32) * (5 / 9);
				} else {
					this.converted = (unit - 32) * (5 / 9) + 273.15;
				}
			} else if (type == TemperatureType.CELSIUS) {
				if (convert == TemperatureType.FAHRENHEIT) {
					this.converted = (unit * (9 / 5)) + 32;
				} else {
					this.converted = unit + 273.15;
				}
			} else {
				if (convert == TemperatureType.FAHRENHEIT) {
					this.converted = (unit - 273.15) * (9 / 5) + 32;
				} else {
					this.converted = unit - 273.15;
				}
			}
		}
	}
	
	public synchronized double print() {
		if (methodB) {
			throw new DepletedMethodException("Method was already used!");
		} else {
			methodB = true;
			printLine(((UtilBasicMath.isInt(unit)) ? ((int) unit) : unit) + " degrees " + type.name + " == " + ((UtilBasicMath.isInt(converted)) ? ((int) converted) : converted) + " degrees " + desire.name);
			printLine();
			return converted;
		}
	}

	@Override
	public void execute() {
		if (desire == null) {
			if (type == TemperatureType.CELSIUS) {
				calculate(TemperatureType.FAHRENHEIT);
			} else {
				calculate(TemperatureType.CELSIUS);
			}
		} else {
			calculate(desire);
		}
		print();
	}
	
	public enum TemperatureType {
		
		FAHRENHEIT("Fahrenheit", 'F'),
		CELSIUS("Celsius", 'C'),
		KELVIN("Kelvin", 'K');
		
		private String name;
		private char unit;
		
		private TemperatureType(String name, char unit) {
			this.name = name;
			this.unit = unit;
		}
		
		public String getName() {
			return name;
		}
		
		public char getUnit() {
			return unit;
		}
	}
	
}
