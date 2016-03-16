package com.alex.apcs.projects.matricies;

public class TicTacToe {
	private char[][] mat;

	public TicTacToe() {
		mat = new char[3][3];
	}

	public TicTacToe(String game) {
		this();
		byte a = 0, b = 0;
		for (char c : game.toCharArray()) {
			mat[a][b] = c;
			b++;
			if (b >= 3) {
				b = 0;
				a++;
			}
		}
	}

	public String getWinner() {
		if (checkRows('X'))
			return "X wins horizontally";
		else if (checkColumns('X'))
			return "X wins vertically";
		else if (checkDiagonals('X'))
			return "X wins diagonally!";
		else if (checkRows('O'))
			return "O wins horizontally!";
		else if (checkColumns('O'))
			return "O wins vertically!";
		else if (checkDiagonals('O'))
			return "O wins diagonally!";
		else
			return "cat's game - no winner!";
	}

	private boolean checkRows(char c) {
		for (char[] ch : mat) {
			byte chks = 0;
			for (char c_ : ch)
				if (c_ == c)
					chks++;
			if (chks >= 3)
				return true;
		}
		return false;
	}

	private boolean checkColumns(char c) {
		for (byte a = 0; a < 3; a++) {
			byte chks = 0;
			for (byte b = 0; b < 3; b++)
				if (mat[b][a] == c)
					chks++;
			if (chks >= 3)
				return true;
		}
		return false;
	}

	private boolean checkDiagonals(char c) {
		if (((mat[0][0] == c) && (mat[1][1] == c) && (mat[2][2] == c))
				|| ((mat[0][2] == c) && (mat[1][1] == c) && (mat[2][0] == c)))
			return true;
		return false;
	}

	@Override
	public String toString() {
		String output = "";
		for (byte a = 0; a < mat.length; a++) {
			for (byte i = 0; i < mat[a].length; i++) {
				output += mat[a][i];
				if (i < (mat[a].length - 1))
					output += " ";
			}
			if (a < (mat.length - 1))
				output += "\n";
		}
		return output + "\n" + getWinner() + "\n\n";
	}
}