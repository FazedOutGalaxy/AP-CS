package com.alex.apcs.project.mathclass;

public class MathLocation {

	private double x;
	private double y;
	
	public static MathLocation forCoords(double x, double y) {
		return new MathLocation(x, y);
	}
	
	private MathLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public MathLocation add(MathLocation location) {
		return add(location.x, location.y);
	}
	
	public MathLocation add(double x, double y) {
		return MathLocation.forCoords(this.x + x, this.y + y);
	}
	
	public MathLocation subtract(MathLocation location) {
		return subtract(location.x, location.y);
	}
	
	public MathLocation subtract(double x, double y) {
		return MathLocation.forCoords(this.x - x, this.y - y);
	}
	
	public double distanceSquared(MathLocation loc) {
		double a = Math.pow(loc.getX() - x, 2);
		double b = Math.pow(loc.getY() - y, 2);
		return a + b;
	}
	
	public double distance(MathLocation loc) {
		return Math.sqrt(distanceSquared(loc));
	}
}
