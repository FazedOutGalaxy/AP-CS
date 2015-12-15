package com.alex.apcs.projects.booleans.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.booleans.RockPaperScissors;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class RPSRunner extends ApcsProject {
	
	private static final RPSRunner instance = new RPSRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}
	
	private static final String format(String original) {
		if (original.equalsIgnoreCase("rock") ||
				original.equalsIgnoreCase("roc") ||
				original.equalsIgnoreCase("roq") ||
				original.equalsIgnoreCase("r")) {
			return "Rock";
		} else if (original.equalsIgnoreCase("paper") ||
				original.equalsIgnoreCase("papper") ||
				original.equalsIgnoreCase("papa") ||
				original.equalsIgnoreCase("pape") ||
				original.equalsIgnoreCase("p")) {
			return "Paper";
		} else {
			return "Scissors";
		}
	}
	

	@Override
	public void execute() {
		RockPaperScissors rps = new RockPaperScissors();
		Scanner scan = new Scanner(System.in);
		for (;;) {
			print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			String playChoice = scan.nextLine();
			rps.setPlayers(format(playChoice));
			printLine(rps);
			printLine();
			print("Do you want to play again? ");
			String gameChoice = scan.nextLine();
			if (!(gameChoice.toLowerCase().charAt(0) == 'y'))
				break;
			printLine();
		}
		scan.close();
	}
}
