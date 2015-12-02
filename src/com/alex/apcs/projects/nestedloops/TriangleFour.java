package com.alex.apcs.projects.nestedloops;

import com.alex.apcs.utils.random.UtilRandomChar;

public class TriangleFour {
	
	private String letter;
	private int size;
	
	public TriangleFour() {
		setTriangle("" + UtilRandomChar.getRandomChar('A', 'Z'), 5);
	}
	
	public TriangleFour(int size, String letter) {
		setTriangle(letter, size);
	}
	
	public String getLetter() { return letter; }
	public int getSize() { return size; }
	
	public void setTriangle(String letter, int size) {
		this.letter = letter;
		this.size = size;
	}
	
	@Override
	public String toString() {
		String to = "";
		for (int a = size; a >= 0; a--) {
			for (int b = 0; b < a; b++) {
				to += letter;
			}
			to += "\n";
		}
		return to;
	}
	
}
