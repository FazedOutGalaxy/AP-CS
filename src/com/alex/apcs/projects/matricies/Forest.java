package com.alex.apcs.projects.matricies;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Forest {

	private Thing[][] grid;
	private final String[] typeList = "cat dog tree rock".split(" ");
	private final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");

	public Forest(int rows, int cols) {
		grid = new Thing[rows][cols];

		// load stuff into the grid
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				grid[r][c] = new Thing(typeList[UtilRandomNumbers.getRandomInteger(0, typeList.length - 1)],
						nameList[UtilRandomNumbers.getRandomInteger(0, nameList.length - 1)],
						UtilRandomNumbers.getRandomDouble(8.0, 35.0));
			}
		}
	}

	public int setTrappedToNull() {
		int count = 0;
		for (int a = 0; a < grid.length; a++)
			for (int b = 0; b < grid[a].length; b++)
				if (isTrapped(a, b)) {
					grid[a][b] = null;
					count++;
				}
		return count;
	}

	// if location ! a rock &&
	// is surrounded by >= 5 trees or rocks larger than 10
	public boolean isTrapped(int r, int c) {
		if (grid[r][c].getType().equals("rock") || grid[r][c].getType().equals("tree"))
			return false;
		else {
			int traps = 0;
			for (int a = -1; a < 2; a++) {
				for (int b = -1; b < 2; b++) {
					if ((a == 0 && b == 0) || !inBounds(r + a, c + b) || grid[r + a][c + b] == null)
						continue;
					Thing t = grid[r + a][c + b];
					if (t.getType().equals("tree"))
						traps++;
					else if (t.getType().equals("rock"))
						if (t.getSize() > 10.0D)
							traps++;
				}
			}
			return traps >= 5;
		}
	}

	private boolean inBounds(int r, int c) {
		return (r > 0 && r < grid.length) && (c > 0 && c < grid[r].length);
	}

	@Override
	public String toString() {
		String output = "";
		for (int a = 0; a < grid.length; a++) {
			for (int b = 0; b < grid[a].length; b++) {
				output += grid[a][b];
				if (b < (grid[a].length - 1))
					output += " ";
			}
			if (a < (grid.length - 1))
				output += "\n";
		}
		return output;
	}
}
