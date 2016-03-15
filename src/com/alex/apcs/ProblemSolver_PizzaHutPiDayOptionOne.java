package com.alex.apcs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.alex.apcs.utils.random.UtilRandomNumbers;

public class ProblemSolver_PizzaHutPiDayOptionOne {

	private static final Set<Long> used = new HashSet<Long>();

	public static void main(String[] args) {
		String number = "";
		long num = 1111111111L;
		/*while (!check(num)) {
			number = "";
			List<Byte> unusedDigits = new ArrayList<Byte>();
			for (byte a = 0; a < 10; a++)
				unusedDigits.add(a);
			for (int i = 0; i < 10; i++) {
				if (unusedDigits.size() >= 2) {
					int index = UtilRandomNumbers.getRandomInteger(0, unusedDigits.size() - 1);
					number += "" + unusedDigits.get(index);
					unusedDigits.remove(index);
				} else {
					number += "" + unusedDigits.get(0);
					unusedDigits.remove(0);
				}
			}
			num = Long.parseLong(number);
			if (used.contains(num))
				continue;
			else
				used.add(num);
		}*/
		for (int i = 0; i < 10; i++) {
			int digit = 1;
			number += digit;
			while(!checkDisivibility(Long.parseLong(number))) {
				number += digit;
				number = number.substring(0, i + 1);
				digit++;
				if (digit >= 10)
					digit = 0;
			}
		}
		System.out.println("The number is " + number);
	}

	private static boolean check(long number) {
		int checks = 0;
		for (int i = 2; i < 10; i++) {
			if (checkDisivibility(Long.parseLong(String.valueOf(number).substring(0, i))))
				checks++;
		}
		return checks >= 8;
	}

	private static boolean checkDisivibility(long number) {
		return String.valueOf(((double) number) / ((double) String.valueOf(number).length())).endsWith(".0");
	}
}
