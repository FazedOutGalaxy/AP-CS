package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Circle;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CircleRunner extends ApcsProject {

	private static CircleRunner instance = new CircleRunner();
	
	@Override
	public void execute() {
		Circle a = new Circle(1);
		a.execute();
		Circle b = new Circle(10);
		b.execute();
		Circle c = new Circle(72.534);
		c.execute();
		Circle d = new Circle(55);
		d.execute();
		Circle e = new Circle(101);
		e.execute();
		Circle f = new Circle(99.952);
		f.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
