package com.alex.apcs.projects.string;

import com.alex.apcs.abstracts.ApcsProject;

public class AddStrings extends ApcsProject {

	private String[] strs = new String[2];
	private String sum = "";
	
	public AddStrings() {
		this.strs[0] = "Alex";
		this.strs[1] = "Rocks!";
	}
	
	public AddStrings(String... strs) {
		this.strs = strs;
	}
	
	public void set(String... strs) {
		this.strs = strs;
	}
	
	public void set(int index, String str) {
		this.strs[index] = str;
	}
	
	public void add() { build(); }
	public void run() { add(); }
	
	public void build() {
		int i = 0;
		for (String str : strs) {
			if (i == strs.length)
				this.sum += str + " ";
			else
				this.sum += str + ".";
			i++;
		}
	}
	
	@Override
	public String toString() { return sum; }

	@Override
	public void execute() {
		add();
	}
}
