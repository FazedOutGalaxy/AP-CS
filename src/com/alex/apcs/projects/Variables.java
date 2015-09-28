package com.alex.apcs.projects;


import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.utils.random.UtilRandomBoolean;
import com.alex.apcs.utils.random.UtilRandomChar;
import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Variables extends ApcsProject {

	private static ApcsProject instance;
	
	public Variables() {
		instance = this;
	}
	
	@Override
	public void execute() {
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String
		
		//integer variables
		byte byteOne = 127;
		short shortOne = UtilRandomNumbers.getRandomShort((short) 1, (short) 9);
		int intOne = UtilRandomNumbers.getRandomInteger(10, 99);
		long longOne = UtilRandomNumbers.getRandomLong(10, 99);
		
		//decimal variables
		float floatOne = 21.0F;
		double doubleOne = 51.0D;
		
		//other integer types
		char charOne = 'A';
		
		//other types
		boolean booleanOne = UtilRandomBoolean.getRandomBoolean();
		char[] ch = new char[11];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = UtilRandomChar.getRandomChar(65, 90);
		}
		String stringOne = "";
		for (char c : ch) {
			stringOne += c;
		}
		
		long intSum = byteOne + shortOne + intOne + longOne;
		double doubleSum = floatOne + doubleOne;
		
		//output your information here
		printLine("/////////////////////////////////");
		printLine("*Alex Chiang            09/11/15*");
		printLine("*                               *");
		printLine("*         integer types         *");
		printLine("*                               *");
		printLine("*8 bit - byteOne = " + byteOne + "\t\t*");
		printLine("*16 bit - shortOne = " + shortOne + "\t\t*");
		printLine("*32 bit - intOne = " + intOne + "\t\t*");
		printLine("*64 bit - longOne = " + longOne + "\t\t*");
		printLine("*                               *");
		printLine("*         real  types           *");
		printLine("*                               *");
		printLine("*32 bit - floatOne = " + floatOne + "\t*");
		printLine("*64 bit - doubleOne = " + doubleOne + "\t*");
		printLine("*                               *");
		printLine("*      other integer types      *");
		printLine("*                               *");
		printLine("*16 bit - charOne = " + charOne + "\t\t*");
		printLine("*                               *");
		printLine("*         other types           *");
		printLine("*                               *");
		printLine("*booleanOne = " + booleanOne + "\t\t*");
		printLine("*stringOne = " + stringOne + "\t*");
		printLine("*                               *");
		printLine("*         number sums           *");
		printLine("*                               *");
		printLine("*all int types sums = " + intSum + "\t*");
		printLine("*all real types sums = " + doubleSum + "\t*");
		printLine("/////////////////////////////////");
	}
	
	public static void main(String[] args) {
		new Variables();
		instance.execute();
	}

}
