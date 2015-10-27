package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Line;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LineRunner extends ApcsProject {

	private static LineRunner instance = new LineRunner();
	
	@Override
	public void execute() {
		Line a = new Line(0, 0, -4, 7);
		a.execute();
		Line b = new Line(1, 7, 18, 3);
		b.execute();
		Line c = new Line(6, 4, 2, 2);
		c.execute();
		Line d = new Line(4, 4, 5, 3);
		d.execute();
		Line e = new Line(11, 1, 2, 9);
		e.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
