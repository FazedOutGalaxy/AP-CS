package com.alex.apcs.instances.oop;

import java.awt.Canvas;
import java.awt.Graphics;

import com.alex.apcs.enums.Color;
import com.alex.apcs.instantiatables.Graphics2DIntSet;
import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DPolygon;
import com.alex.apcs.instantiatables.Graphics2DSize;
import com.alex.apcs.utils.jframe.UtilDraw;

public class BigHouse extends Canvas {

	private static final long serialVersionUID = -402762837940510944L;
	private int x = 50;
	private int y = 50;
	private UtilDraw draw;
	
	public BigHouse() {
		init();
	}
	
	public BigHouse(int x, int y) {
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
	}
	
	private synchronized void paint() {
		draw.setNextDrawColor(Color.BLUE);
		draw.drawString("big house ".toUpperCase(), Graphics2DLocation.forCoords(x, y));
		
		/* House */
			/* Building */
			draw.drawRect(Color.BLUE, Graphics2DLocation.forCoords(10 * 6 + 275, 40 * 6), Graphics2DSize.forSize(310, 200), true);
			
				/* Windows */
				draw.drawRect(Color.YELLOW, Graphics2DLocation.forCoords(375, 275), Graphics2DSize.forSize(50, 50), true);
				draw.drawRect(Color.YELLOW, Graphics2DLocation.forCoords(555, 275), Graphics2DSize.forSize(50, 50), true);
				
				
				draw.drawLine(Color.BLACK, Graphics2DLocation.forCoords(400, 275), Graphics2DLocation.forCoords(400, 325));
				draw.drawLine(Color.BLACK, Graphics2DLocation.forCoords(580, 275), Graphics2DLocation.forCoords(580, 325));
				
				draw.drawLine(Color.BLACK, Graphics2DLocation.forCoords(375, 300), Graphics2DLocation.forCoords(425, 300));
				draw.drawLine(Color.BLACK, Graphics2DLocation.forCoords(555, 300), Graphics2DLocation.forCoords(605, 300));
				
				/* Door */
				draw.drawRect(Color.BROWN, Graphics2DLocation.forCoords(375 + 80, 350), Graphics2DSize.forSize(65, 90), true);
				draw.drawCircle(Color.DARK_GRAY, Graphics2DLocation.forCoords(375 + 80 + 50, 350 + 35), 10, true);
			/* Roof */
			draw.drawPolygon(Color.RED_BROWN, Graphics2DPolygon.forCoords(Graphics2DIntSet.forArray(610, 610, 610 + 40, 610 + 40), Graphics2DIntSet.forArray(160 - 35, 175, 225, 150 - 25), 4), true);
			draw.drawPolygon(Color.LIGHT_BROWN, Graphics2DPolygon.forCoords(Graphics2DIntSet.forArray(10 * 6 + 250, 20 * 6 + 250, 60 * 6 + 250, 70 * 6 + 250), Graphics2DIntSet.forArray(40 * 6, 10 * 6 + 100, 10 * 6 + 100, 40 * 6), 4), true);
			
			
				
		/* Tree */
		draw.drawCircle(Color.BROWN, Graphics2DLocation.forCoords(763, 335), 75, true);
		draw.drawCircle(Color.DARK_GREEN, Graphics2DLocation.forCoords(750, 300), 100, true);
		//draw.drawArc(Color.BROWN, Graphics2DLocation.forCoords(750, 350), Graphics2DSize.forSize(100, 100), -90, 35, true);
		draw.drawRect(Color.BROWN, Graphics2DLocation.forCoords(787, 400), Graphics2DSize.forSize(25, 100), true);
		
		
	}
}
