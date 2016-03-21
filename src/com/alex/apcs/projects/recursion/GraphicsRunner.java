package com.alex.apcs.projects.recursion;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import javax.swing.JFrame;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class GraphicsRunner extends JFrame {

	private static final long serialVersionUID = -4351473167735596779L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner() {
		super("Graphics Runner");
		setSize(WIDTH, HEIGHT);

		getContentPane().add(new RecursiveCircles());

		setVisible(true);
	}

	public static void main(String args[]) {
		new GraphicsRunner();
	}
}