package com.alex.apcs.projects.references.list.runners;


import javax.swing.JFrame;

import com.alex.apcs.projects.references.list.WinterScenePanel;

public class GraphicsRunner extends JFrame {
	private static final long serialVersionUID = -8393042575962496187L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner() {
		super("THE WINTER SCENE PROJECT");
		setSize(WIDTH, HEIGHT);

		getContentPane().add(new WinterScenePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GraphicsRunner();
	}
}