package com.alex.apcs.projects.booleans;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class RockPaperScissors {
	
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() {
		setPlayers(getRandomChoice());
	}

	public RockPaperScissors(String player) {
		setPlayers(player);
	}

	public void setPlayers(String playChoice) {
		if (isValid(playChoice))
			this.playChoice = playChoice;
		else
			this.playChoice = getRandomChoice();
		this.compChoice = getRandomChoice();
	}

	public String determineWinner() {
		boolean playerWin = true;
		boolean tie = false;
		String reason = "";
		if (playChoice.equals("Rock")) {
			if (compChoice.equals("Rock")) {
				playerWin = false;
				tie = true;
			} else if (compChoice.equals("Paper")) {
				playerWin = false;
				tie = false;
				reason = "Paper Covers Rock";
			} else if (compChoice.equals("Scissors")) {
				playerWin = false;
				tie = false;
				reason = "Rock Breaks Scissors";
			}
		} else if (playChoice.equals("Paper")) {
			if (compChoice.equals("Rock")) {
				playerWin = true;
				tie = false;
				reason = "Paper Covers Rock";
			} else if (compChoice.equals("Paper")) {
				playerWin = false;
				tie = true;
			} else if (compChoice.equals("Scissors")) {
				playerWin = false;
				tie = false;
				reason = "Scissors Cuts Paper";
			}
		} else {
			if (compChoice.equals("Rock")) {
				playerWin = false;
				tie = false;
				reason = "Rock Breaks Scissors";
			} else if (compChoice.equals("Paper")) {
				playerWin = true;
				tie = false;
				reason = "Scissors Cuts Paper";
			} else if (compChoice.equals("Scissors")) {
				playerWin = false;
				tie = true;
			}
		}
		if (playerWin) {
			return "!Player wins" + " <<" + reason + ">>" + "!";
		} else {
			if (tie)
				return "!Draw Game!";
			else
				return "!Computer wins" + " <<" + reason + ">>" + "!";
		}
	}

	@Override
	public String toString() {
		String output = "player had " + playChoice.charAt(0) + "\n" + "computer had " + compChoice.charAt(0) + "\n" + determineWinner();
		return output;
	}
	
	public static String getRandomChoice() {
		int random = UtilRandomNumbers.getRandomInteger(1, 3);
		switch (random) {
		case 1:
			return "Rock";
		case 2:
			return "Paper";
		case 3:
			return "Scissors";
		default:
			return null;
		}
	}
	
	public static boolean isValid(String choice) {
		return choice.equals("Rock") || choice.equals("Paper") || choice.equals("Scissors");
	}
}