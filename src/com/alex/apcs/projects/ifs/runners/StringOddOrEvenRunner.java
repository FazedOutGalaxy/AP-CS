package com.alex.apcs.projects.ifs.runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifs.StringOddOrEven;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class StringOddOrEvenRunner extends ApcsProject {

	private static final StringOddOrEvenRunner instance = new StringOddOrEvenRunner();
	private static boolean runForever = true;
	private static final List<String> lennies = new ArrayList<String>();
	
	@Override
	public void execute() {
		setup();
		//printLine(method());
		Scanner scan = new Scanner(System.in);
		while(runForever) {
			print("Enter a word :: ");
			String word = scan.nextLine();
			if (word.equalsIgnoreCase("666")) {
				printTroll(word, "satan");
			} else if (lennies.contains(word)) {
				printTroll(word, "lenny");
			}
			print(word + " is ");
			if (StringOddOrEven.isEven(word)) {
				print("even");
			} else {
				print("odd");
			}
			print(".");
			printLines(2);
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		instance.execute();
	}

	public static boolean method() {
		return method();
	}
	
	private synchronized void setup() {
		lennies.clear();
		add(lennies, "( ͡° ͜ʖ ͡°)");
		add(lennies, "( ͠° ͟ʖ ͡°)");
		add(lennies, "ᕦ( ͡° ͜ʖ ͡°)ᕤ");
		add(lennies, "( ͡~ ͜ʖ ͡°)");
		add(lennies, "( ͡o ͜ʖ ͡o)");
		add(lennies, "͡° ͜ʖ ͡ -");
		add(lennies, "( ͡͡ ° ͜ ʖ ͡ °)﻿");
		add(lennies, "( ͡ ͡° ͡°  ʖ ͡° ͡°)");
		add(lennies, "(ง ͠° ͟ل͜ ͡°)ง");
		add(lennies, "( ͡° ͜ʖ ͡ °)");
		add(lennies, "(ʖ ͜° ͜ʖ)");
		add(lennies, "[ ͡° ͜ʖ ͡°]");
		add(lennies, "ヽ༼ຈل͜ຈ༽ﾉ");
		add(lennies, "( ͡o ͜ʖ ͡o)");
		add(lennies, "{ ͡• ͜ʖ ͡•}");
		add(lennies, "( ͡° ͜V ͡°)");
		add(lennies, "( ͡^ ͜ʖ ͡^)");
		add(lennies, "( ‾ʖ̫‾)");
		add(lennies, "( ͡°╭͜ʖ╮͡° )");
		add(lennies, "ᕦ( ͡°╭͜ʖ╮͡° )ᕤ");
	}
	
	private void printTroll(String word, String troll) {
		printLine(word + " is " + troll.toUpperCase() + ".");
		printLine();
		for (int i = 1; i < 101; i++) {
			print(troll.toUpperCase());
			if ((i != 0) && ((i % 20) == 0)) printLine();
		}
		printLine();
	}
	
	private void printLines(int count) {
		for (int i = 0; i < Math.abs(count); i++) {
			printLine();
		}
	}
}
