package com.alex.apcs.projects.interfaces.runners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.interfaces.Word_Length;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Word_LengthRunner extends ApcsProject {
	
	private static final Word_LengthRunner instance = new Word_LengthRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Scanner file;
		try {
			file = new Scanner(new File("word.dat"));
		} catch (FileNotFoundException ex) {
			printLine("File not found: " + ex.getMessage());
			return;
		}
		List<Word_Length> list = new ArrayList<Word_Length>();
		
		int size = file.nextInt();

		for (int i = 0; i < size; i++) {
			String s = file.next();
			list.add(new Word_Length(s));
		}
		
		Collections.sort(list);
		
		Iterator<Word_Length> iter = list.iterator();
		while (iter.hasNext())
			printLine(iter.next());
	}
}