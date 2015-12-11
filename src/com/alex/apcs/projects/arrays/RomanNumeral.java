package com.alex.apcs.projects.arrays;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class RomanNumeral {
	
	private int number;
	private String roman;

	private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50,
			40, 10, 9, 5, 4, 1 };
	private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" };

	public RomanNumeral(String roman) {
		setRoman(roman);
	}

	public RomanNumeral(int number) {
		setNumber(number);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setRoman(String roman) {
		this.roman = roman;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return roman + "\n";
	}
}