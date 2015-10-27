package com.alex.apcs.instances.oop;

import java.awt.Color;

import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DSize;
import com.alex.apcs.utils.jframe.UtilDraw;
import com.alex.apcs.utils.params.UtilParams;

public class Shape {

	private UtilParams params;
	private UtilDraw draw;
	private Color color;
	private Graphics2DLocation loc;
	private Graphics2DSize size;
	
	public static Shape forParams(UtilParams params, boolean draw) {
		if (draw) return new Shape(params).draw(); else return new Shape(params);
	}
	
	private Shape(UtilParams params) {
		this.params = params;
		init();
	}
	
	private synchronized void init() {
		if (params.parse(0, UtilDraw.class)) {
			this.draw = (UtilDraw) params.read(0);
		}
		if (params.parse(1, Color.class)) {
			this.color = (Color) params.read(1);
		}
		if (params.parse(2, Graphics2DLocation.class)) {
			this.loc = (Graphics2DLocation) params.read(2);
		}
		if (params.parse(3, Graphics2DSize.class)) {
			this.size = (Graphics2DSize) params.read(3);
		}
	}
	
	public Shape draw() {
		return paint();
	}
	
	private Shape paint() {
		draw.drawCircle(color, loc, size.getHeight(), true);
		draw.drawRect(Color.YELLOW, Graphics2DLocation.forCoords(loc.getX(), loc.getY()), size.multiply(0.5), true);
		draw.drawLine(Color.BLACK, loc.add(1, size.getHeight() / 4), loc.subtract(size.getWidth() - 1, size.getHeight() / 4));
		return this;
	}
}
