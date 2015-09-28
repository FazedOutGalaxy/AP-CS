package com.alex.apcs.instances.oop;

import java.awt.Canvas;
import java.awt.Graphics;

import com.alex.apcs.enums.Color;
import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DSize;
import com.alex.apcs.projects.oop.GraphicsRunner;
import com.alex.apcs.utils.jframe.UtilDraw;

public class SmileyFace extends Canvas {
	
	private static final long serialVersionUID = -402762837940510944L;
	private int x = 35;
	private int y = 35;
	private UtilDraw draw;
	private Graphics2DLocation loc;
	
	public SmileyFace() {
		init();
	}
	
	public SmileyFace(int x, int y) {
		init();
		this.x = x;
		this.y = y;
	}
	
	private synchronized void init() {
		setSize(800, 600);
		setBackground(Color.WHITE);
		setVisible(true);
		this.loc = Graphics2DLocation.forCoords(x, y);
	}

	public void paint(Graphics window) {
		this.draw = UtilDraw.forGraphics(window);
		function();
	}
	
	private synchronized void function() {
		final int MID = 300;
        final int TOP = 100;
        
		draw.setNextDrawColor(Color.BLUE);
		draw.drawString("SMILEY FACE LAB", loc);
		
		//draw.drawCircle(Color.YELLOW, Graphics2DLocation.forCoords(210, 100), 400, true);
		
		/* Face */
		draw.drawCircle(Color.TAN, Graphics2DLocation.forCoords(200, 50), 350, true);
		
        draw.setNextDrawColor(Color.BLACK);
        /* Eyes */
		draw.drawCircle(Graphics2DLocation.forCoords(270 + 10, 150), 50, true);
        draw.drawCircle(Graphics2DLocation.forCoords(400 + 10, 150), 50, true);
        
        /* Pupils */
        draw.drawCircle(Color.RED, Graphics2DLocation.forCoords(270 + 35, 150 + 25), 10, true);
        draw.drawCircle(Color.RED, Graphics2DLocation.forCoords(400 + 35, 150 + 25), 10, true);
        
        /* Mouth */
        draw.drawArc(Graphics2DLocation.forCoords(MID + 13, TOP + 200), Graphics2DSize.forSize(120, 40), 190, 175, true);
	}
	
	public static void main(String args[]) {
		GraphicsRunner.main(args);
	}
}
