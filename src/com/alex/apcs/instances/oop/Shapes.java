package com.alex.apcs.instances.oop;

import java.awt.Canvas;
import java.awt.Graphics;

import com.alex.apcs.enums.Color;
import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DSize;
import com.alex.apcs.utils.jframe.UtilDraw;
import com.alex.apcs.utils.params.UtilParams;
import com.alex.apcs.utils.random.UtilRandomNumbers;

public class Shapes extends Canvas {
	
	private static final long serialVersionUID = 3991001320886751765L;
	private int x = 50;
	private int y = 50;
	private UtilDraw draw;
	
	public Shapes() {
		init();
	}
	
	public Shapes(int x, int y) {
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
		draw.drawString(Color.BLUE, "shapes lab".toUpperCase(), Graphics2DLocation.forCoords(x, y));
	}
	
	private synchronized void paint() {
		for (int i = 0; i < 5; i++) {
			int size = UtilRandomNumbers.getRandomInteger(10, 100);
			Shape.forParams(UtilParams.forParams(draw, Color.GREEN, Graphics2DLocation.forCoords(UtilRandomNumbers.getRandomInteger(100, 1000), UtilRandomNumbers.getRandomInteger(100, 1000)), Graphics2DSize.forSize(size, size)), false).draw();
		}
	}
}
