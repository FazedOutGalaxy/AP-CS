package com.alex.apcs.projects.arrays.runners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import com.alex.apcs.projects.arrays.Tree;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class GraphicsRunner extends JFrame implements MouseListener {

	private static final long serialVersionUID = -7562375736948538878L;
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;

	public GraphicsRunner() {
		super("Graphics Runner");
		setSize(WIDTH, HEIGHT);

		getContentPane().add(new Tree());

		setVisible(true);
		addMouseListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		GraphicsRunner run = new GraphicsRunner();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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