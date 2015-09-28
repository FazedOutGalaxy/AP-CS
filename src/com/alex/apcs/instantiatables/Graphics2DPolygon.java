package com.alex.apcs.instantiatables;

import java.awt.Polygon;

public class Graphics2DPolygon {

	private int[] x;
	private int[] y;
	private int n;
	private Polygon polygon;
	
	public static Graphics2DPolygon forCoords(Graphics2DIntSet xSet, Graphics2DIntSet ySet, int n) {
		return new Graphics2DPolygon(xSet.getArray(), ySet.getArray(), n);
	}
	
	private Graphics2DPolygon(int[] x, int[] y, int n) {
		this.x = x;
		this.y = y;
		this.n = n;
		init();
	}
	
	private synchronized void init() {
		this.polygon = new Polygon(x, y, n);
	}
	
	public Polygon getPolygon() {
		return polygon;
	}
	
}
