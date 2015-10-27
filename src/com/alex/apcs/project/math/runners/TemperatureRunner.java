package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Temperature;
import com.alex.apcs.project.math.Temperature.TemperatureType;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TemperatureRunner extends ApcsProject {

	private static TemperatureRunner instance = new TemperatureRunner();
	
	@Override
	public void execute() {
		Temperature a = new Temperature(32, TemperatureType.FAHRENHEIT);
		a.execute();
		Temperature b = new Temperature(52.30, TemperatureType.FAHRENHEIT);
		b.execute();
		Temperature c = new Temperature(82.45, TemperatureType.FAHRENHEIT);
		c.execute();
		Temperature d = new Temperature(75.00, TemperatureType.FAHRENHEIT);
		d.execute();
		Temperature e = new Temperature(100.00, TemperatureType.FAHRENHEIT);
		e.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
