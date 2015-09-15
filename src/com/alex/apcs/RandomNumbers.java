package com.alex.apcs;

import java.util.Random;

import com.alex.apcs.enums.PercentMode;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class RandomNumbers {

	private static Random random = new Random();
	
	public static int getRandomInteger(int min, int max) {
		return (random.nextInt(((max - min) + 1)) + min);
	}
	
	public static long getRandomLong(long min, long max) {
		 return min + (long)(random.nextDouble()*(max - min));
	}
	
	public static double getRandomDouble(double min, double max) {
		return min + (max - min) * random.nextDouble();
	}
	
	public static float getRandomFloat(float min, float max) {
		return ((float) (min + (max - min) * random.nextDouble()));
	}
	
	public static float getRandomPercent(PercentMode mode) {
		boolean pm;
		switch(mode) {
		case DECIMAL:
			pm = true;
			break;
		case OUT_OF_HUNDRED:
			pm = false;
			break;
		default: 
			pm = true;
			break;
		}
		if (pm) return random.nextFloat();
		else return ((random.nextFloat()) * 100);
	}
	
	public static short getRandomShort(short min, short max) {
		return ((short) getRandomInteger(min, max));
	}
}
