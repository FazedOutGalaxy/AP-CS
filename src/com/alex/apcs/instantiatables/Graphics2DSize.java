package com.alex.apcs.instantiatables;

public class Graphics2DSize {

	private int width;
	private int height;
	
	public static Graphics2DSize forSize(int x, int y) {
		return new Graphics2DSize(x, y);
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
}
