package com.alex.apcs.instances.oop;

import java.awt.Canvas;
import java.awt.Graphics;

import com.alex.apcs.enums.Color;
import com.alex.apcs.instantiatables.Graphics2DIntSet;
import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DPolygon;
import com.alex.apcs.instantiatables.Graphics2DSize;
import com.alex.apcs.utils.jframe.UtilDraw;

public class Robot extends Canvas {
	
	private static final long serialVersionUID = -3854146949729965121L;

	private int x = 35;
	private int y = 35;
	private UtilDraw draw;
	
	public Robot() {
		init();
	}
	
	public Robot(int x, int y) {
		init();
		this.x = x;
		this.y = y;
	}
	
	private synchronized void init() {
		setSize(800, 600);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	@Override
	public void paint(Graphics window) {
		this.draw = UtilDraw.forGraphics(window);
		paint();
		draw.drawString(Color.BLUE, "Robot " + "lab ".toUpperCase(), Graphics2DLocation.forCoords(x, y));
	}
	
	private synchronized void paint() {
		paintHead();
		paintUpperBody();
		paintLowerBody();
	}
	
	private void paintHead() {
		draw.drawRect(Graphics2DLocation.forCoords(1, 1), Graphics2DSize.forSize(1, 1), true);
	}
	
	private void paintUpperBody() {
		draw.drawRect(Graphics2DLocation.forCoords(1, 1), Graphics2DSize.forSize(1, 1), true);
	}
	
	private void paintLowerBody() {
		
	}
}
