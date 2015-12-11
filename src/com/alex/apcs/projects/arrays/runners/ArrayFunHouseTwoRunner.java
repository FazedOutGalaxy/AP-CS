package com.alex.apcs.projects.arrays.runners;

import java.util.Arrays;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arrays.ArrayFunHouseTwo;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class ArrayFunHouseTwoRunner extends ApcsProject {
	
	private static final ArrayFunHouseTwoRunner instance = new ArrayFunHouseTwoRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = {1,2,3,9,11,20,30};
		int[] c = {9,8,7,6,5,4,3,2,0,-2};
		int[] d = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
		
		int[][] p = {a, b, c, d};
		
		for (int[] array : p) {
			printLine(Arrays.toString(array));
			printLine("is going Up ?  " + ArrayFunHouseTwo.goingUp(array));
		}
		
		printEmptyLines(2);
		
		for (int[] array : p) {
			printLine(Arrays.toString(array));
			printLine("is going Down ?  " + ArrayFunHouseTwo.goingDown(array));
		}
		
		printEmptyLines(2);
		
		printLine(d);
		printLine("first 7 values greater than 9  " + ArrayFunHouseTwo.getCountValuesBiggerThanX(d, 7, 9));
		printLine("first 5 values greater than 15  " + ArrayFunHouseTwo.getCountValuesBiggerThanX(d, 5, 15));
	}
}