package com.alex.apcs.projects.references.array.runners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang
 *
 */
public class GradeBookFileRunner extends ApcsProject {
	
	private static final GradeBookFileRunner instance = new GradeBookFileRunner();
	
	public static void main(String[] args) throws Exception{
		instance.execute();
	}
	
	@Override
	public void execute() {
		printLine("Welcome to the Class Stats program!");
		Scanner file;
		try {
			file = new Scanner(new File("gradebook.dat"));
		} catch (FileNotFoundException e) {
			printLine("File not found: " + e.getMessage());
			return;
		}
		
		file.close();
	}
}