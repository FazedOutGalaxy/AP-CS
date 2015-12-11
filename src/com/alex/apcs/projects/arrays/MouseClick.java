package com.alex.apcs.projects.arrays;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClick implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("x: " + arg0.getX() + ", y: " + arg0.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("x: " + arg0.getX() + ", y: " + arg0.getY());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("x: " + arg0.getX() + ", y: " + arg0.getY());
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("x: " + arg0.getX() + ", y: " + arg0.getY());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("x: " + arg0.getX() + ", y: " + arg0.getY());
	}

}
