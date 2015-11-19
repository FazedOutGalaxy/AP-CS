package com.alex.apcs.projects.booleans.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.booleans.PasswordCheck;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class PassRunner extends ApcsProject {
	
	private static final PassRunner instance = new PassRunner();
	
	public static void main(String args[]) {
		instance.execute();
	}

	@Override
	public void execute() {
		PasswordCheck pswdChk = new PasswordCheck();
		pswdChk.execute();
	}
}