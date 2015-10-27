package com.alex.apcs.projects.ifs;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Discount {

	public static double getDiscountedBill(double bill, float discount) {
		if (bill > 2000.0D) 
			return (bill - (bill * (discount / 100.0F)));
		 else 
			return bill;
	}
}
