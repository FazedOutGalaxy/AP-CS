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
	
	public Graphics2DLocation add(Graphics2DLocation location) {
		return add(location.x, location.y);
	}
	
	public Graphics2DLocation add(int x, int y) {
		return Graphics2DLocation.forCoords(this.x + x, this.y + y);
	}
	
	public Graphics2DLocation subtract(Graphics2DLocation location) {
		return subtract(location.x, location.y);
	}
	
	public Graphics2DLocation subtract(int x, int y) {
		return Graphics2DLocation.forCoords(this.x - x, this.y - y);
	}
	
	public double distanceSquared(Graphics2DLocation loc) {
		double a = Math.pow(loc.getX() - x, 2);
		double b = Math.pow(loc.getY() - y, 2);
		return a + b;
	}
	
	public double distance(Graphics2DLocation loc) {
		return Math.sqrt(distanceSquared(loc));
	}
}
