package com.alex.apcs.exceptions;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public abstract class APCSException extends Error{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4426351922604988815L;
	 
	public APCSException() {
		super();
	}
	
	public APCSException(String reason) {
		super(reason);
	}

}
