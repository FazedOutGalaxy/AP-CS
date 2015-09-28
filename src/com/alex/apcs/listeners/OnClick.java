package com.alex.apcs.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OnClick implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("x: " + arg0.getLocationOnScreen().getX() + "\n" + "y: " + arg0.getLocationOnScreen().getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("x: " + arg0.getLocationOnScreen().getX() + "\n" + "y: " + arg0.getLocationOnScreen().getY());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("x: " + arg0.getLocationOnScreen().getX() + "\n" + "y: " + arg0.getLocationOnScreen().getY());
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("x: " + arg0.getLocationOnScreen().getX() + "\n" + "y: " + arg0.getLocationOnScreen().getY());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("x: " + arg0.getLocationOnScreen().getX() + "\n" + "y: " + arg0.getLocationOnScreen().getY());
	}

}
