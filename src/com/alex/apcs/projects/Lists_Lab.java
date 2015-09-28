package com.alex.apcs.projects;

import java.util.ArrayList;
import java.util.List;

import com.alex.apcs.RandomNumbers;
import com.alex.apcs.abstracts.ApcsProject;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Lists_Lab extends ApcsProject {

	private static ApcsProject instance = new Lists_Lab();
	
	public Lists_Lab() {
		instance = this;
	}
	
	@Override
	public void execute() {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) 
			numbers.add(new Integer(RandomNumbers.getRandomInteger(1, 100)));
    	numbers.set(2, new Integer(10));
    	printLine("" + numbers);
   		printLine("Sum: " + sumList(numbers));
	}

	private int sumList(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
    		sum += i;
    	}
		return sum;
	}
	
	public static void main(String[] args) {
		instance.execute();
	}
}
