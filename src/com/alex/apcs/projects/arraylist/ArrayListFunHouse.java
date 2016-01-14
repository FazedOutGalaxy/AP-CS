package com.alex.apcs.projects.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ArrayListFunHouse {
	
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i < number; i++)
			if (number % i == 0)
				factors.add(i);
		return factors;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		List<Integer> clone = new ArrayList<Integer>();
		for (int a = 0; a < nums.size(); a++) {
			clone.add(nums.get(a));
		}
		for (int i : clone) {
			if (getListOfFactors(i).isEmpty())
				nums.remove(new Integer(i));
		}
	}
}