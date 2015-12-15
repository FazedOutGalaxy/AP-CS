package com.alex.apcs.projects.arrays.runners;

import java.util.Arrays;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arrays.ArrayFunHouse;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 * 
 */
public class ArrayFunHouseRunner extends ApcsProject {

	private static final ArrayFunHouseRunner instance = new ArrayFunHouseRunner();

	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		int[] one = { 4, 10, 0, 1, 7, 6, 5, 3, 2, 9 };

		printLine(Arrays.toString(one));
		printLine("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one, 3, 6));
		printLine("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one, 2, 9));
		printLine("# of 4s  =  " + ArrayFunHouse.getCount(one, 4));
		printLine("# of 9s  =  " + ArrayFunHouse.getCount(one, 9));
		printLine("# of 7s  =  " + ArrayFunHouse.getCount(one, 7));
		one = ArrayFunHouse.removeVal(one, 7);
		printLine("new array with all 7s removed  =  " + Arrays.toString(one));
		printLine("# of 7s  =  " + ArrayFunHouse.getCount(one, 7));
		
		printEmptyLines(2);
		
		int[] two = { 4, 2, 3, 4, 6, 7, 8, 9, 0, 10, 0, 1, 7, 6, 5, 3, 2, 9, 9, 8, 7 };

		printLine(Arrays.toString(two));
		printLine("sum of spots 3-6  =  " + ArrayFunHouse.getSum(two, 3, 6));
		printLine("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two, 2, 9));
		printLine("# of 0s  =  " + ArrayFunHouse.getCount(two, 4));
		printLine("# of 3s  =  " + ArrayFunHouse.getCount(two, 9));
		printLine("# of 7s  =  " + ArrayFunHouse.getCount(two, 7));
		two = ArrayFunHouse.removeVal(two, 7);
		printLine("new array with all 7s removed  =  " + Arrays.toString(two));
		printLine("# of 7s  =  " + ArrayFunHouse.getCount(two, 7));
	}
}