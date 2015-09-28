package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Variables_Lab extends ApcsProject {

	private static ApcsProject instance;
	
	public Variables_Lab() {
		instance = this;
	}
	
	@Override
	public void execute() {
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String
		//integer variables
		byte byteOne = 127;
		//decimal variables
		//other integer types
		//other types
		//output your information here
		printLine("/////////////////////////////////");
		printLine("*Jim Bob                08/18/06*");
		printLine("*                               *");
		printLine("*        integer types          *");
		printLine("*                               *");
		printLine("*8 bit - byteOne = " + byteOne + "\t\t*");
	}
	
	public static void main(String[] args) {
		new Variables_Lab();
		instance.execute();
	}

}
