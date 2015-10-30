package com.alex.apcs.projects.ifelse;

import com.alex.apcs.utils.params.UtilParams;

public class WordsCompare {

	private String a, b;
	private int compare;
	
	public WordsCompare() {
		setStrings("Alex", "Rocks");
	}
	
	public WordsCompare(String a, String b) {
		setStrings(a, b);
	}
	
	public WordsCompare(UtilParams params) throws IllegalArgumentException {
		try {
			setStrings((String) params.read(0), (String) params.read(1));
		} catch (ClassCastException ex) {
			throw new IllegalArgumentException("Invalid parameter!");
		}
	}
	
	public void setStrings(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public void compare() {
		this.compare = a.compareTo(b);
	}
	
	@Override
	public String toString() {
		if (compare < 0)
			return a + " should be placed before " + b + "\n";
		 else
			return a + " should be placed after " + b + "\n";
	}
	
	
}
