package com.alex.apcs.projects;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Ifs_Lab extends ApcsProject {

	@Override
	public void execute() {
		Scanner kb = new Scanner(System.in);
        
        print("Enter an integer :: ");
        int num = kb.nextInt();
        printLine();
        if(num%2 == 1) {
        	printLine("You're number is odd!");
        } else {
        	printLine("You're number is even!");
        }
        kb.close();
	}

}
