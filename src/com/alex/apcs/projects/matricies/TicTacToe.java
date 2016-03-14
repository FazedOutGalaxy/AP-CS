package com.alex.apcs.projects.matricies;

public class TicTacToe {
	private char[][] mat;

	public TicTacToe() {
		mat = new char[3][3];
	}

	public TicTacToe(String game) {
		byte a = 0;
		byte b = 0;
		for (char c  : game.toCharArray()) {
			mat[a][b] = c;
			a++;
			if (a >= 3) {
				a = 0;
				b++;
			}
		}
	}

	public String getWinner() {
		return "";
	}

	@Override
	public String toString() {
		String output = "";

		return output + "\n\n";
	}
}