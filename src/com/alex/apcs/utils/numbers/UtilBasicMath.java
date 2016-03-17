package com.alex.apcs.utils.numbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class UtilBasicMath {

	public static boolean isEven(double arg0) {
		return ((arg0 % 2) == 0.0D);
	}

	public static boolean isOdd(double arg0) {
		return ((arg0 % 2) != 0.0D);
	}

	public static boolean isEven(long arg0) {
		return arg0 % 2 == 0;
	}

	public static boolean isOdd(long arg0) {
		return arg0 % 2 != 0;
	}

	public static double round(double arg0, int places) {
		if (places == 0) {
			return Math.round(arg0);
		} else {
			return ((Math.round(arg0 * (Math.pow(10.0D, places)))) / (Math.pow(10.0D, places)));
		}
	}

	public static int roundDown(double arg0) {
		return ((int) Math.floor(arg0));
	}

	public static int roundUp(double arg0) {
		return ((int) Math.ceil(arg0));
	}

	public static double roundDownReturnDouble(double arg0) {
		return (Math.ceil(arg0));
	}

	public static double roundUpReturnDouble(double arg0) {
		return (Math.floor(arg0));
	}

	public static long sum(long[] arg0) {
		long sum = 0;
		for (int i = 0; i < arg0.length; i++) {
			sum += arg0[i];
		}
		return sum;
	}

	public static long product(long[] arg0) {
		long product = 0;
		for (int i = 0; i < arg0.length; i++) {
			product *= arg0[i];
		}
		return product;
	}

	public static double sum(double[] arg0) {
		double sum = 0.0D;
		for (int i = 0; i < arg0.length; i++) {
			sum += arg0[i];
		}
		return sum;
	}

	public static double product(double[] arg0) {
		double sum = 0.0D;
		for (int i = 0; i < arg0.length; i++) {
			sum *= arg0[i];
		}
		return sum;
	}

	public static boolean isInt(double arg0) {
		return ((arg0 == Math.floor(arg0)) && (!Double.isInfinite(arg0)));
	}

	public static boolean isPositive(double arg0) {
		return (arg0 > 0.0D);
	}

	public static boolean isNegative(double arg0) {
		return !isPositive(arg0);
	}

	public static boolean isSingular(double arg0) {
		return (arg0 == 0.0D);
	}

	/*
	 * public static boolean isSingular(long arg0) { return isSingular(arg0); }
	 */

	public static boolean isMultiple(double arg0) {
		return !isSingular(arg0);
	}

	public static boolean isMultiple(long arg0) {
		return !isSingular(arg0);
	}

}
