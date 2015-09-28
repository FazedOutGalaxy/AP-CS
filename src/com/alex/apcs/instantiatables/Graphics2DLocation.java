package com.alex.apcs.instantiatables;

public class Graphics2DLocation {

	private int x;
	private int y;
	
	public static Graphics2DLocation forCoords(int x, int y) {
		return new Graphics2DLocation(x, y);
	}
	
	private Graphics2DLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
