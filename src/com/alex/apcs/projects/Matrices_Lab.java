package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Matrices_Lab extends ApcsProject {

	private static ApcsProject instance = new Matrices_Lab();
	
	public Matrices_Lab() {
		instance = this;
	}
	
	@Override
	public void execute() {
		int[][] mat = {{2,3,4},{55,66,77},{22,11}};
		printLine(sumMat(mat));
	}

	public static int sumMat(int[][] mat) {
		int sum = 0;
		for (int i = 0; i <= mat.length; i++) {
			for (int a = 0; a <= mat[i].length; a++) {
				sum += mat[i][a];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
