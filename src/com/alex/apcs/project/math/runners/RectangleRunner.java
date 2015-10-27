package com.alex.apcs.project.math.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.project.math.Rectangle;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class RectangleRunner extends ApcsProject {

	private static RectangleRunner instance = new RectangleRunner();
	
	@Override
	public void execute() {
		Rectangle a = new Rectangle(2, 6, false);
		a.execute(); 
		Rectangle b = new Rectangle(12, 5, false);
		b.execute();
		Rectangle c = new Rectangle(131, 75, false);
		c.execute();
		Rectangle d = new Rectangle(20, 25, false);
		d.execute();
		Rectangle e = new Rectangle(9, 256, false);
		e.execute();
		Rectangle f = new Rectangle(36, 72, false);
		f.execute();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

}
