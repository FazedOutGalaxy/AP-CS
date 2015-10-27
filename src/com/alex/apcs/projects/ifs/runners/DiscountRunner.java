package com.alex.apcs.projects.ifs.runners;

import java.util.Scanner;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifs.Discount;
import com.alex.apcs.utils.numbers.UtilBasicMath;
import com.alex.apcs.utils.random.UtilRandomBoolean;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DiscountRunner extends ApcsProject {

	private static final DiscountRunner instance = new DiscountRunner();
	private static boolean runForever = true;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		boolean firstRun = true;
		while (runForever) {
			print("Enter the bill amount :: ");
			double price = scan.nextDouble();
			float discount = 15.0F;
			if (!firstRun && UtilRandomBoolean.getRandomBoolean())
				discount = queueForDiscount(scan);
			final double after = Discount.getDiscountedBill(price, discount);
			if (UtilBasicMath.isInt(after)) {
				print("Bill after discount :: $" +  ((long) after));
			} else {
				if (String.valueOf(after).substring(String.valueOf(after).indexOf('.')).length() == 2) {
					print("Bill after discount :: $" +  after + "0");
				} else {
					print("Bill after discount :: $" +  ((Math.round(after * 100.0D) / 100.0D)));
				}
			}
			printLine();
			printLine();
			firstRun = false;
		}
		scan.close();
	}

	public static void main(String[] args) {
		instance.execute();
	}
	
	public float queueForDiscount(Scanner scan) {
		print("Enter discount percent :: ");
		return scan.nextFloat();
	}

}
