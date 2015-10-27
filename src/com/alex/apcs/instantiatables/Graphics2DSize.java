package com.alex.apcs.instantiatables;

public class Graphics2DSize {

	private int width;
	private int height;
	
	public static Graphics2DSize forSize(int width, int height) {
		return new Graphics2DSize(width, height);
	}
	
	private Graphics2DSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Graphics2DSize multiply(double arg0) {
		return Graphics2DSize.forSize((int) Math.round(arg0 * width), (int) Math.round(arg0 * height));
	}
}
