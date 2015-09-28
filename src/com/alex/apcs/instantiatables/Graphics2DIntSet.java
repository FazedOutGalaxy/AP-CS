package com.alex.apcs.instantiatables;

public class Graphics2DIntSet {

	private int[] array;
	
	public static Graphics2DIntSet forArray(int... array) {
		return new Graphics2DIntSet(array);
	}
	
	private Graphics2DIntSet(int[] array) {
		this.array = array;
	}
	
	public int[] getArray() {
		return array;
	}
}
