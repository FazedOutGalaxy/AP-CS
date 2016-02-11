package com.alex.apcs.projects.references.list;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
import java.awt.Graphics2D;

public class SnowMan extends AbstractShape {
	public SnowMan(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 0);
	}

	public void draw(Graphics window) {
		window.setColor(getColor());
		window.fillOval(getXPos() + getWidth() / 3, getYPos(), getWidth() / 3,
				getHeight() / 4);
		window.fillOval(getXPos() + getWidth() / 4,
				getYPos() + getHeight() / 5, getWidth() / 2, getHeight() / 2);
		window.fillOval(getXPos(), getYPos() + getHeight() / 2, getWidth(),
				getHeight());
		window.setColor(getColor());
		window.fillOval(getXPos() - 30, getYPos() + 175, getWidth() + 50,
				getHeight() - 100);
		// buttons
		window.setColor(Color.BLACK);
		window.fillOval(getXPos() + getWidth() / 2 - 10, getYPos()
				+ getHeight() / 2 - 35, getWidth() / 10, getHeight() / 8);
		window.fillOval(getXPos() + getWidth() / 2 - 10, getYPos()
				+ getHeight() / 2, getWidth() / 10, getHeight() / 8);
		window.fillOval(getXPos() + getWidth() / 2 - 10, getYPos()
				+ getHeight() / 2 + 35, getWidth() / 10, getHeight() / 8);
		// nose
		window.setColor(Color.ORANGE);
		window.fillOval(getXPos() + getWidth() / 2, getYPos() + getHeight() / 2
				- 60, getWidth() / 4, getHeight() / 15);
		// sun thingy
		window.setColor(Color.YELLOW);
		window.fillOval(-100, -100, 400, 400);
		Graphics2D g2 = (Graphics2D) window;
		g2.setStroke(new BasicStroke(10.0f));
		g2.setPaint(Color.YELLOW);
		window.drawLine(50, 50, 100, 350);
		window.drawLine(50, 200, 200, 250);

		// tree
		Color brown = new Color(139, 69, 19);
		window.setColor(brown);
		window.fillRect(280, 310, 40, 300);
		window.setColor(Color.GREEN);
		window.fillOval(250, getYPos() - 50, 100, 100);

	}

	public void moveAndDraw(Graphics window) {
		draw(window);
	}
}