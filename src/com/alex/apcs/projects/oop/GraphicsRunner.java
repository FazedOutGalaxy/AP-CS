package com.alex.apcs.projects.oop;

import javax.swing.JFrame;

import com.alex.apcs.abstracts.EasyJFrameApcsProject;
import com.alex.apcs.enums.oop.ApcsOopProjectType;
import com.alex.apcs.listeners.OnClick;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
@SuppressWarnings("unused")
public class GraphicsRunner extends EasyJFrameApcsProject {
	
	private static final GraphicsRunner instance = new GraphicsRunner();
	private static final long serialVersionUID = 1580681561580832769L;

	private static final int WIDTH = 1024;
	private static final int HEIGHT = 768;

	public GraphicsRunner() {
		super("Graphics Runner");
	}
	
	@Override
	public void execute() {
		addMouseListener(new OnClick());
		setSize(WIDTH, HEIGHT);
		
		//Smiley Face. Uncomment to run, then comment out all others. Re-comment to disable.
		//getContentPane().add(new S);
		
		//Smiley Face. Uncomment to run, then comment out all others. Re-comment to disable.
		//getContentPane().add(ApcsOopProjectType.SMILEY_FACE.getProject());
		
		//Big House. Uncomment to run, then comment out all others. Re-comment to disable.
		//getContentPane().add(ApcsOopProjectType.BIG_HOUSE.getProject());
		
		//Robot. Uncomment to run, then comment out all others. Re-comment to disable.
		//getContentPane().add(ApcsOopProjectType.ROBOT.getProject());
		
		//Shapes. Uncomment to run, then comment out all others. Re-comment to disable.
		//getContentPane().add(ApcsOopProjectType.SHAPES.getProject());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		instance.execute();
	}
	
	public static GraphicsRunner getInstance() {
		return instance;
	}
}
