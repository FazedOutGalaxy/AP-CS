package com.alex.apcs.enums;

public final class Color {

	public static final java.awt.Color RED = java.awt.Color.RED;
	public static final java.awt.Color ORANGE = java.awt.Color.ORANGE;
	public static final java.awt.Color YELLOW = java.awt.Color.YELLOW;
	public static final java.awt.Color GREEN = java.awt.Color.GREEN;
	public static final java.awt.Color CYAN = java.awt.Color.CYAN;
	public static final java.awt.Color BLUE = java.awt.Color.BLUE;
	public static final java.awt.Color MAGENTA = java.awt.Color.MAGENTA;
	
	public static final java.awt.Color LIGHT_GRAY = java.awt.Color.LIGHT_GRAY;
	public static final java.awt.Color DARK_GRAY = java.awt.Color.DARK_GRAY;
	public static final java.awt.Color BLACK = java.awt.Color.BLACK;
	public static final java.awt.Color WHITE = java.awt.Color.WHITE;
	
	public static final java.awt.Color TAN = getFromRGB(211, 207, 126);
	public static final java.awt.Color DARK_GREEN = GREEN.darker();
	public static final java.awt.Color BROWN = getFromRGB(139, 69, 19);
	public static final java.awt.Color LIGHT_BROWN = BROWN.brighter();
	public static final java.awt.Color RED_BROWN = getFromRGB(165, 42, 42);
	
	public static java.awt.Color getFromRGB(int r, int g, int b) {
		return new java.awt.Color(r, g, b);
	}
}
