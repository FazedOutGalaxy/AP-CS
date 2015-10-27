package com.alex.apcs.projects;

import com.alex.apcs.abstracts.ApcsProject;

public class MathCalc extends ApcsProject {

	private static MathCalc instance = new MathCalc();
	
	@Override
	public void execute() {
		double z = 123.456;
		int a = 5, b = 2;
		long x = 7;
		char var = 'H';
		printLine(3 + 3 * 3);
		printLine(a * (a % b));
		printLine(b / a);
		printLine('A' + 5 * b);
		printLine(1 % 5);
		printLine(a % b);
		printLine(b % a);
		printLine('A' + 5);
		printLine();
		printLine("**********");
		printLine();
		printLine((double) (a / b));
		printLine((double) a / b);
		printLine(var + 5);
		printLine((char) (var + 5));
		a = var + 2;
		printLine(a);
		z = var + 5;
		printLine(z);
		var = 'A' + 4;
		printLine(var);
		a *= 2 + 5;
		printLine(a);
		var = (char) (z - 25);
		printLine(var);
		a++;
		printLine(a);
		b--;
		printLine(b);
		++x;
		printLine(x);
		printLine(--var);
	}

	public static void main(String[] args) {
		instance.execute();
	}
}
