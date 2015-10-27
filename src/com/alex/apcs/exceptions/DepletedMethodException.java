package com.alex.apcs.exceptions;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class DepletedMethodException extends APCSException {
	
	private static final long serialVersionUID = -5858041452234092874L;

	public DepletedMethodException() {
		super();
	}
	
	public DepletedMethodException(String reason) {
		super(reason);
	}
}
