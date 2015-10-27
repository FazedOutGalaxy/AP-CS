package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Average;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class AverageRunner extends ApcsProject {

	private static AverageRunner instance = new AverageRunner();
	
	@Override
	public void execute() {
		Average a = new Average(5, 7);
		a.execute();
		Average b = new Average(90, 100);
		b.execute();
		Average c = new Average(100.5, 85.8);
		c.execute();
		Average d = new Average(-100, 55);
		d.execute();
		Average e = new Average(15236, 5642);
		e.execute();
		Average f = new Average(1000, 555);
		f.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
