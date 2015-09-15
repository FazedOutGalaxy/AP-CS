package com.alex.apcs.projects;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Input extends ApcsProject {

	@Override
	public void execute() {
		Scanner keyboard = new Scanner(System.in);
		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		print("Enter a decimal :: ");
		doubleOne = keyboard.nextDouble();
		print("Enter a decimal :: ");
		doubleTwo = keyboard.nextDouble();
		print("Enter a float (smaller decimal) :: ");
		floatOne = keyboard.nextFloat();
		print("Enter a float (smaller decimal) :: ");
		floatTwo = keyboard.nextFloat();
		print("Enter a short (smaller integer) :: ");
		shortOne = keyboard.nextShort();
		print("Enter a short (smaller integer) :: ");
		shortTwo = keyboard.nextShort();
		printLine();
		printLine("integer one = " + intOne);
		printLine("integer two = " + intTwo);
		printLine("double one = " + doubleOne);
		printLine("double two = " + doubleTwo);
		printLine("float one = " + floatOne);
		printLine("float two = " + floatTwo);
		printLine("short one = " + shortOne);
		printLine("short two = " + shortTwo);
		keyboard.close();
	}

}
