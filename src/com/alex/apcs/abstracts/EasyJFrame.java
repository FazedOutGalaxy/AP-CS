package com.alex.apcs.abstracts;

import java.awt.GraphicsConfiguration;

import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public abstract class EasyJFrame extends JFrame {
	
	private static final long serialVersionUID = -8747124148864204873L;

	public EasyJFrame() { super(); }
	
	public EasyJFrame(GraphicsConfiguration arg0) { super(arg0); }
	
	public EasyJFrame(String arg0) { super(arg0); }
	
	public EasyJFrame(String arg0, GraphicsConfiguration arg1) { super(arg0, arg1); }
	
	public final AccessibleContext getAccessibleContext() { return accessibleContext; }
	
	public final JRootPane getRootPane() { return rootPane; }
	
	public final boolean isRootPaneCheckingEnabled() { return rootPaneCheckingEnabled; }
}
