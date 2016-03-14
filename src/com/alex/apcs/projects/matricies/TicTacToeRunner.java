package com.alex.apcs.projects.matricies;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;

public class TicTacToeRunner extends ApcsProject {

	private static final TicTacToeRunner instance = new TicTacToeRunner();

	public static void main(String[] args) {
		instance.execute();
	}

	@Override
	public void execute() {
		Scanner scan;
		try {
			scan = new Scanner(new File("tictactoe.dat"));
		} catch (FileNotFoundException ex) {
			printLine("File not found: " + ex.getMessage());
			return;
		}
		int times = Integer.parseInt(scan.nextLine());
		for (int a = 0; a < times; a++) {
			String game = scan.nextLine();
			printLine(new TicTacToe(game));
		}
		scan.close();
	}
}