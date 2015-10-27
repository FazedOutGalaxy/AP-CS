package com.alex.apcs.projects.ifs;

import com.alex.apcs.utils.random.UtilRandomChar;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class CharacterAnalyzer {
	
	private char c;
	
	public CharacterAnalyzer() {
		this.c = UtilRandomChar.getRandomChar(Character.MIN_VALUE, Character.MAX_VALUE);
	}
	
	public CharacterAnalyzer(char c) {
		this.c = c;
	}
	
	public CharacterAnalyzer(int c) {
		this.c = (char) c;
	}
	
	public CharacterAnalyzer(Character c) {
		this.c = c.charValue();
	}
	
	public void setChar(char c) {
		this.c = c;
	}
	
	public void setChar(int c) {
		this.c = (char) c;
	}
	
	public void setChar(Character c) {
		this.c = c.charValue();
	}
	
	public char getChar() {
		return c;
	}
	
	public boolean isUpperCase() {
		return (String.valueOf(c).equals(String.valueOf(c).toUpperCase()) && (!isNumber()));
	}
	
	public boolean isLowerCase() {
		return (String.valueOf(c).equals(String.valueOf(c).toLowerCase()) && (!isNumber()));
	}
	
	public boolean isNumber() {
		try {
			Integer.parseInt(String.valueOf(c));
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	public int getAscii() {
		return ((int) c);
	}
	
	public int getASCII() { 
		return getAscii();
	}
	
	@Override
	public String toString() {
		if (isNumber())
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";
		if (isLowerCase()) {
			return getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else if (isUpperCase()) {
			return getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
		} else {
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
	}
}
