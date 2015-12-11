package com.alex.apcs.projects.switchcase;

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseButtonTester extends JFrame implements MouseListener {

	public static void main(String[] args) {
		new MouseButtonTester();
	}
	
	private static final long serialVersionUID = 1902420303791894932L;
	private int mouseX, mouseY;
	private int mouseButton;
	private boolean isFirstRun;
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;

	public MouseButtonTester() {
		super("Mouse Button Tester");
		
		mouseX = mouseY = 0;
		mouseButton = 0;
		isFirstRun = true;

		setSize(WIDTH,HEIGHT);
		setBackground(Color.WHITE);
		setVisible(true);

		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		mouseButton = e.getButton();
		repaint();
	}

	@Override
	public void paint(Graphics window) {
		if(isFirstRun) {
			window.setColor(Color.WHITE);
			window.fillRect(0,0,WIDTH, HEIGHT);
				
			//change isFirstRun
		
		}
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.setColor(Color.BLUE);
		window.drawString("MOUSE BUTTON TESTER", 420,55);
		
		draw(window);
	}

	public void draw(Graphics window) {
		if(mouseButton==MouseEvent.BUTTON1) {
			//window.drawString("BUTTON1", 50,200);  //debug code
			window.setColor(Color.RED);
			window.drawRect(mouseX,mouseY,10,10);
		}
		//right mouse button pressed
		{
			
		
		}
		//any other mouse button pressed
		{
		
		
		
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) { System.out.println("swag"); }
	@Override
	public void mouseExited(MouseEvent e) { System.out.println("swag");  }
	@Override
	public void mousePressed(MouseEvent e) { System.out.println("swag");  }
	@Override
	public void mouseReleased(MouseEvent e) {  System.out.println("swag"); }
}