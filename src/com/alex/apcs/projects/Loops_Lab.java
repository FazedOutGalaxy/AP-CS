package com.alex.apcs.projects;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Loops_Lab extends ApcsProject {

	@Override
	public void execute() {
		 Scanner kb = new Scanner( System.in );
		 print( "Enter a starting number :: ");
	     int numOne = kb.nextInt();
	     print( "Enter an ending number :: ");
	     printLine();
	     int numTwo = kb.nextInt();
	     if (numOne < numTwo) {
	    	 for (int i = (numOne + 1); i < (numTwo); i++) {
	    		 print(i + " ");
	    	 }
	     } else {
	    	 for (int i = (numTwo + 1); i < (numOne); i++) {
	    		 print(i + " ");
	    	 }
	     }
	     printLine();
	     int i;
	     if (numOne < numTwo) {
	    	i = (numOne - 1);
	    	while (i < numTwo) {
	    		print(i + " ");
	    	}
	     } else {
	    	i = (numTwo - 1);
	    	while (i < numOne) {
	    		print(i + " ");
	    	}
	     }
	     printLine();
	     kb.close();
	}
}
