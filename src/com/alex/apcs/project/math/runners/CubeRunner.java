package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Cube;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CubeRunner extends ApcsProject {

	private static CubeRunner instance = new CubeRunner();
	
	@Override
	public void execute() {
		Cube a = new Cube(2);
		a.execute();
		Cube b = new Cube(4);
		b.execute();
		Cube c = new Cube(33);
		c.execute();
		Cube d = new Cube(50);
		d.execute();
		Cube e = new Cube(5);
		e.execute();
		Cube f = new Cube(19);
		f.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
