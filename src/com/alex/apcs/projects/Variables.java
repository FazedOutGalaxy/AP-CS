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

	@Override
	public void execute() {
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String
		
		//integer variables
		byte byteOne = 127;
		short shortOne = UtilRandomNumbers.getRandomShort((short) 0, Short.MAX_VALUE);
		int intOne = UtilRandomNumbers.getRandomInteger(1, Integer.MAX_VALUE);
		long longOne = UtilRandomNumbers.getRandomLong(1L, Long.MAX_VALUE);
		
		//decimal variables
		float floatOne = UtilRandomNumbers.getRandomFloat(1.0F, 50.0F);
		double doubleOne = UtilRandomNumbers.getRandomDouble(1.0D, 50.0D);
		
		//other integer types
		char charOne = UtilRandomChar.getRandomChar(1, 100);
		
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
		
		//output your information here
		printLine("/////////////////////////////////");
		printLine("*Alex Chiang             09/11/15*");
		printLine("*                               *");
		printLine("*        integer types          *");
		printLine("*                               *");
		printLine("*8 bit - byteOne = " + byteOne + "\t\t*");
		printLine("*16 bit - shortOne = " + shortOne + "\t\t*");
		printLine("*32 bit - intOne = " + intOne + "\t\t*");
		printLine("*64 bit - longOne = " + longOne + "\t\t*");
		printLine("*                               *");
		printLine("*          real  types          *");
		printLine("*                               *");
		printLine("*32 bit - floatOne = " + floatOne + "\t\t*");
		printLine("*64 bit - doubleOne = " + doubleOne + "\t\t*");
		printLine("*                               *");
		printLine("*       other integer types     *");
		printLine("*                               *");
		printLine("*16 bit - charOne = " + charOne + "\t\t*");
		printLine("*                               *");
		printLine("*           other types         *");
		printLine("*                               *");
		printLine("*booleanOne = " + booleanOne + "\t\t*");
		printLine("*stringOne = " + stringOne + "\t\t*");
		printLine("/////////////////////////////////");
	}

}
