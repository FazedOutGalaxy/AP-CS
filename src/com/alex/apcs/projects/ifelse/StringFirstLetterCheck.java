package com.alex.apcs.projects.ifelse;

import com.alex.apcs.utils.params.UtilParams;

public class StringFirstLetterCheck {

	private String a, b;
	
	public StringFirstLetterCheck(String a, String b) {
		setStrings(a, b);
	}
	
	public StringFirstLetterCheck(UtilParams params) throws IllegalArgumentException {
		try {
			setStrings(((String) params.read(0)), ((String) params.read(1)));
		} catch (ClassCastException ex) {
			throw new IllegalArgumentException("Illegal parameter!");
		}
	}
	
	public void setStrings(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean checkFirstLetter() {
		return a.charAt(0) == b.charAt(0);
	}
	
	@Override
	public String toString() {
		return a + ((checkFirstLetter()) ? " has " : " does not have ") + "the same first letter as " + b + "\n";
	}
}
