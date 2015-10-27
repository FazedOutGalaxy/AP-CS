package com.alex.apcs.projects.string.runners;

import com.alex.apcs.projects.string.AddStrings;

public class AddRunner {

	private static AddStrings instance = new AddStrings();
	
	public static void main(String[] args) {
		AddStrings strings = new AddStrings();
		strings.execute();
		System.out.println(strings);
		instance.execute();
	}
}
