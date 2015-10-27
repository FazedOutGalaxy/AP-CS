package com.alex.apcs.projects.ifs;

import com.alex.apcs.utils.numbers.UtilBasicMath;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class StringOddOrEven {

	public static boolean isEven(String number) {
		return UtilBasicMath.isEven(number.length());
	}
	
	public static boolean isOdd(String number) {
		return UtilBasicMath.isOdd(number.length());
	}
}
