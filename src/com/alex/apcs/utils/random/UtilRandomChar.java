package com.alex.apcs.utils.random;

import com.alex.apcs.RandomNumbers;

public class UtilRandomChar {
	
	public static char getRandomChar(char min, char max) {
		return ((char) (RandomNumbers.getRandomInteger(min, max)));
	}
	
	public static char getRandomChar(int min, int max) {
		return ((char) (RandomNumbers.getRandomInteger(min, max)));
	}
}
