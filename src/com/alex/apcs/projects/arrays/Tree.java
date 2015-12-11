package com.alex.apcs.projects.arrays;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.alex.apcs.enums.Color;
import com.alex.apcs.instantiatables.Graphics2DIntSet;
import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DPolygon;
import com.alex.apcs.utils.jframe.UtilDraw;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class Tree extends Canvas implements MouseListener {
	
	private static final long serialVersionUID = 7739305104373936802L;

	public Tree() {
		setBackground(Color.WHITE);
	}

	@Override
	public void paint(Graphics window) {
		UtilDraw draw = UtilDraw.forGraphics(window);
		draw.drawString(new Font("TAHOMA", Font.BOLD, 12), "Lab14h - Tree Lab", Graphics2DLocation.forCoords(50, 50));
		tree(draw);
		ordiments(draw);
		presents(draw);
		star(draw);
		addMouseListener(this);
	}

	public void tree(UtilDraw draw) {
		int[] treeXPoints = { 400, 200, 600 };
		int[] treeYPoints = { 100, 500, 500 };
		draw.drawPolygon(Color.GREEN, 
				Graphics2DPolygon.forCoords(Graphics2DIntSet.forArray(treeXPoints), Graphics2DIntSet.forArray(treeYPoints), 3), true);
	}
	
	public void ordiments(UtilDraw draw) {
		int[] x = {415, 385, 315, 370, 470, 380, 470, 455, 410, 420, 365, 280, 355, 455, 380, 355};
		int[] y = {175, 250, 405, 240, 360, 220, 455, 435, 435, 330, 460, 425, 300, 280, 375, 470};
		for (int i = 0; i < x.length; i++) {
			draw.drawCircle(Color.getRandomColor(), Graphics2DLocation.forCoords(x[i], y[i]), 15, true);
		}
	}
	
	public void presents(UtilDraw draw) {
		
	}

	public void star(UtilDraw draw) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("x: " + e.getX() + ", " + "y: " + e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
}