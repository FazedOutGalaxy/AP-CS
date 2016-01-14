package com.alex.apcs.projects.arraylist.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arraylist.ArrayListFunHouse;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ArrayListFunHouseRunner extends ApcsProject {

	private static final ArrayListFunHouseRunner instance = new ArrayListFunHouseRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		printLine(ArrayListFunHouse.getListOfFactors(9));
		printLine(ArrayListFunHouse.getListOfFactors(23));
		printLine(ArrayListFunHouse.getListOfFactors(50));
		printLine(ArrayListFunHouse.getListOfFactors(100));
		printLine(ArrayListFunHouse.getListOfFactors(762));
		
		Integer[] nums = { 2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77,
				79 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));
		printLine(list);
		ArrayListFunHouse.keepOnlyCompositeNumbers(list);
		printLine(list);
	}
}