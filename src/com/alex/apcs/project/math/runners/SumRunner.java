package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Sum;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class SumRunner extends ApcsProject {

	private static SumRunner instance = new SumRunner();
	
	@Override
	public void execute() {
		Sum a = new Sum(5, 5);
		a.execute();
		Sum b = new Sum(90, 100);
		b.execute();
		Sum c = new Sum(100.5, 85.8);
		c.execute();
		Sum d = new Sum(-100, 55);
		d.execute();
		Sum e = new Sum(15236, 5642);
		e.execute();
		Sum f = new Sum(1000, 555);
		f.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
