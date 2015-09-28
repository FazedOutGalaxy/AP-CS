package com.alex.apcs.projects;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NestedLoops_Lab extends ApcsProject {

	private static ApcsProject instance = new NestedLoops_Lab();
	
	public NestedLoops_Lab() {
		instance = this;
	}
	
	@Override
	public void execute() {
		Scanner kb = new Scanner(System.in);
        
        System.out.print( "Enter the width of the box: ");
        int width = kb.nextInt();
        System.out.print( "Enter the height of the box: ");
        int height = kb.nextInt();
        for (int i = 0; i < height; i++) {
        	for (int a = 0; a < width; a++) {
        		print("*");
        	}
        	printLine();
        }

        kb.close();
	}
	
	public static void main(String[] args) {
		new NestedLoops_Lab();
		instance.execute();
	}

}
