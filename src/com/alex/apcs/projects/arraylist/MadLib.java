package com.alex.apcs.projects.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class MadLib extends ApcsProject {
	
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	public MadLib() {
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		loadNouns();
		loadVerbs();
		loadAdjectives();
	}

	public void loadNouns() {
		try {
			Scanner scan = new Scanner(new File("nouns.dat"));
			while (scan.hasNextLine()) {
				nouns.add(scan.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public void loadVerbs() {
		try {
			Scanner scan = new Scanner(new File("verbs.dat"));
			while (scan.hasNextLine()) {
				verbs.add(scan.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public void loadAdjectives() {
		try {
			Scanner scan = new Scanner(new File("adjectives.dat"));
			while (scan.hasNextLine()) {
				adjectives.add(scan.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public String getRandomVerb() {
		return (String) getRandom(verbs);
	}

	public String getRandomNoun() {
		return (String) getRandom(nouns);
	}

	public String getRandomAdjective() {
		return (String) getRandom(adjectives);
	}

	@Override
	public String toString() {
		String to = "";
		Scanner scan;
		try {
			scan = new Scanner(new File("story.dat"));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			return null;
		}
		while (scan.hasNext()) {
			String next = scan.next();
			if (next.equals("#"))
				if (scan.hasNext())
					to += getRandomNoun() + " ";
				else
					to += getRandomNoun() + ".";
			else if (next.equals("@"))
				if (scan.hasNext())
					to += getRandomVerb() + " ";
				else
					to += getRandomVerb() + ".";
			else if (next.equals("&"))
				if (scan.hasNext())
					to += getRandomAdjective() + " ";
				else
					to += getRandomAdjective() + ".";
			else
				if (scan.hasNext())
					to += next + " ";
				else
					to += next + ".";
		}
		scan.close();
		return to;
	}
	
	private Object getRandom(List<?> list) {
		if (list.size() == 0)
			return null;
		if (list.size() == 1)
			return list.get(0);
		else 
			return list.get(UtilRandomNumbers.getRandomInteger(0, list.size() - 1));
	}

	@Override
	public void execute() {
		printLine(toString());
	}
}