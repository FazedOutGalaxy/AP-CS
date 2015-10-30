package com.alex.apcs.projects.ifelse;

import com.alex.apcs.utils.params.UtilParams;

public class StringLengthCheck {

	private String a, b;
	
	public StringLengthCheck(String a, String b) {
		setStrings(a, b);
	}
	
	public StringLengthCheck(UtilParams params) throws IllegalArgumentException {
		try {
			setStrings(params);
		} catch (ClassCastException ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}
	
	public void setStrings(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public void setStrings(UtilParams params) throws ClassCastException {
		this.a = (String) params.read(0);
		this.b = (String) params.read(1);
	}
	
	public boolean checkLength() {
		return a.length() == b.length();
	}
	
	@Override
	public String toString() {
		return a + ((checkLength()) ? " has " : " does not have ") + "the same # of letters as " + b;
	}
}
