package com.alex.apcs.utils.exceptions;

import com.alex.apcs.exceptions.APCSException;
import com.alex.apcs.exceptions.APCSExceptionType;
import com.alex.apcs.exceptions.AlexTooSwagException;
import com.alex.apcs.exceptions.DepletedMethodException;
import com.alex.apcs.exceptions.DivideByZero;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class UtilException {

	public static void throwException(APCSExceptionType type, String reason) {
		APCSException ex = null;
		switch(type) {
		case ALEX_TOO_SWAG:
			ex = new AlexTooSwagException(reason);
			break;
		case DIVIDE_BY_ZERO:
			ex = new DivideByZero(reason);
			break;
		case DEPLETED_METHOD:
			ex = new DepletedMethodException(reason);
			break;
		}
		throw ex;
	}
	
	public static void throwException(APCSExceptionType type) {
		APCSException ex = null;
		switch(type) {
		case ALEX_TOO_SWAG:
			ex = new AlexTooSwagException();
			break;
		case DIVIDE_BY_ZERO:
			ex = new DivideByZero();
			break;
		case DEPLETED_METHOD:
			ex = new DepletedMethodException();
			break;
		}
		throw ex;
	}
}
