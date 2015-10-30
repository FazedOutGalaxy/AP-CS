package com.alex.apcs.projects.ifelse;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class StringEquality {

	private String a, b;
	
	public StringEquality() {
		setStrings("", "");
	}
	
	public StringEquality(String a, String b) {
		setStrings(a, b);
	}
	
	public void setWords(String a, String b) {
		setStrings(a, b);
	}
	
	public void setStrings(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean checkEquality(boolean ignoreCase) {
		return ((ignoreCase) ? a.equalsIgnoreCase(b) : a.equals(b));
	}
	
	@Override
	public String toString() {
		return a + " does " + ((!checkEquality(true)) ? "not" : "") + " have the same letters as " + b + "\n";
	}
	
}
