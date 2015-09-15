package com.alex.apcs.utils.random;

import java.util.Random;

public class UtilRandomBoolean {

	private static Random rand = new Random();
	
	public static boolean getRandomBoolean() {
		return rand.nextBoolean();
	}
	
	public static Boolean getRandomObjectBoolean() {
		return new Boolean(getRandomBoolean());
	}
}
