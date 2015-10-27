package com.alex.apcs;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import com.alex.apcs.enums.ApcsProjectType;
import com.alex.apcs.managers.RegexCensor;
import com.alex.apcs.utils.numbers.UtilBasicMath;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
@SuppressWarnings("unused")
public class Main {

	private static int total;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		pr(false, "Give me a statement to censor: ");
		String str = scan.nextLine();
		pr(true, "");
		pr(true, "Censored: \n" + RegexCensor.censor(str));
		scan.close();
	}
	
	public static void pr(boolean newLine, String str) {
		if (newLine) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
}
