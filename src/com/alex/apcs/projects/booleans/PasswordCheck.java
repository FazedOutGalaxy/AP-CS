package com.alex.apcs.projects.booleans;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class PasswordCheck extends ApcsProject {
	
	public static final String INVALID = "INVALID";
	public static final String VALID = "VALID";
	
	private String password;
	private Scanner scan;
	
	public PasswordCheck() {
		scan = new Scanner(System.in);
		password = "413x 1z $w4g";
	}
	
	public PasswordCheck(String password) {
		this.password = password;
	}

	public void check() {
		String guessed = "";
		while (!guessed.equals(password)) {
			print("Enter the password :: ");
			guessed = scan.nextLine();
			if (!guessed.equals(password))
				printLine(INVALID);
		}
		printLine(VALID);
		scan.close();
		discard();
	}

	@Override
	public void execute() {
		check();
	}
}