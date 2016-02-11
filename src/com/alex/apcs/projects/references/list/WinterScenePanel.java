package com.alex.apcs.projects.references.list;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.alex.apcs.enums.Color;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */

public class WinterScenePanel extends JPanel implements Runnable {

	private static final long serialVersionUID = 4698541207498947338L;
	private List<AbstractShape> shapes;
	private AbstractShape sMan;

	public WinterScenePanel() {
		setVisible(true);
		shapes = new ArrayList<AbstractShape>();
		for (int i = 0; i < 50; i++) {
			int y = (int) (Math.random() * 600);
			int s = (int) (Math.random() * 30) + 20;
			shapes.add(new SimpleSnowFlake(i * 14, y, s, s));
		}
		sMan = new SnowMan(500, 350, 200, 150);
		new Thread(this).start();
	}

	@Override
	public void update(Graphics window) {
		paint(window);
	}

	@Override
	public void paint(Graphics window) {
		window.setColor(Color.BLACK);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("MAKE A WINTER SCENE!", 40, 40);

		sMan.draw(window);
		for (AbstractShape sh : shapes) {
			sh.moveAndDraw(window);
			if (sh.getYPos() >= getHeight()) {
				sh.setYPos(0);
			}
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(35);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}