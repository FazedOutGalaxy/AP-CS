package com.alex.apcs.project.strings;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class AddStrings extends ApcsProject {
	
	public boolean print = true;
	private String[] strings;
	private String sum = "";
	
	public AddStrings(String... strings) {
		this.strings = strings;
	}
	
	public AddStrings(UtilParams params) throws IllegalArgumentException {
		try {
			this.strings = (String[]) params.getParameters();
		} catch (ClassCastException ex) {
			throw new IllegalArgumentException("Invalid parameters!");
		}
	}
	
	public synchronized void calculate() {
		int i = 0;
		for (String s : strings) {
			if (i == (strings.length - 1)) 
				this.sum += s;
			else
				this.sum += s + " ";
			i++;
		}
	}
	
	@Override
	public String toString() {
		return "Sum: " + sum;
	}
	
	public void print() {
		printLine(toString());
	}
	
	@Override
	public void execute() {
		 calculate();
		 if (print)
			 print();
	}
}
