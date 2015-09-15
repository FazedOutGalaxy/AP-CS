package com.alex.apcs.exceptions;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DivideByZero extends APCSException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4381328519791420480L;

	public DivideByZero() {
		super();
	}
	
	public DivideByZero(String reason) {
		super(reason);
	}
}
