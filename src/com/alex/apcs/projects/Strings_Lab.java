package com.alex.apcs.projects;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Strings_Lab extends ApcsProject {

	@Override
	public void execute() {
		Scanner kb = new Scanner( System.in );
		print( "Enter a word :: ");
        String text = kb.nextLine();
        printLine();
        printLine("First Letter: " + text.charAt(0));
        printLine("Last Letter: " + text.charAt(text.length() - 1));
        String rev = "";
        boolean vowel = false;
        for (int i = (text.length()); i > 0; i--) {
        	rev += text.substring(i - 1, i);
        	if (text.substring(i - 1, i).equalsIgnoreCase("a") ||
        			text.substring(i - 1, i).equalsIgnoreCase("e") ||
        			text.substring(i - 1, i).equalsIgnoreCase("i") ||
        			text.substring(i - 1, i).equalsIgnoreCase("o") ||
        			text.substring(i - 1, i).equalsIgnoreCase("u")) {
        		vowel = true;
        	}
        }
        printLine("Reverse: " + rev);
        if (vowel) printLine("It has a lowercase vowel!");
        kb.close();
	}

}
