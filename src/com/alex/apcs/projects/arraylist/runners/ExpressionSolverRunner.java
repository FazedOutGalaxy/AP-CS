package com.alex.apcs.projects.arraylist.runners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.arraylist.ExpressionSolver;
import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class ExpressionSolverRunner extends ApcsProject {

	private static final ExpressionSolverRunner instance = new ExpressionSolverRunner();
	private static final Set<String> expressions = new HashSet<String>();

	public static void main(String[] args) {
		if (expressions.isEmpty())
			init();
		instance.execute();
	}

	private static final synchronized void init() {
		expressions.clear();
		expressions.add("3 + 5 * 6 / 3 + 3");
		for (int i = 0; i < 4; i++) {
			int[] nums = new int[5];
			for (byte g = 0; g < nums.length; g++)
				nums[g] = UtilRandomNumbers.getRandomInteger(1, 10);
			int[] oper = new int[4];
			for (byte g = 0; g < oper.length; g++)
				oper[g] = UtilRandomNumbers.getRandomInteger(1, 4);
			String s = "";
			for (byte h = 0; h < nums.length; h++) {
				if (h == nums.length - 1)
					s += nums[h];
				else {
					s += nums[h] + " ";
					int op = oper[h];
					if (op == 1)
						s += "*";
					else if (op == 2)
						s += "/";
					else if (op == 3)
						s += "+";
					else if (op == 4)
						s += "-";
					s += " ";
				}
			}
			expressions.add(s);
		}
	}

	@Override
	public void execute() {
		ExpressionSolver es = new ExpressionSolver();
		// es.setIsIntegerDivision(false);
		Iterator<String> iter = expressions.iterator();
		while (iter.hasNext()) {
			es.setExpression(iter.next());
			es.execute();
			printLine(es);
		}
	}
}