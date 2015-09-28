package com.alex.apcs.enums;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.Alphabet;
import com.alex.apcs.projects.ArrayList_Lab;
import com.alex.apcs.projects.Array_Lab;
import com.alex.apcs.projects.AsciiArt;
import com.alex.apcs.projects.AsciiBox;
import com.alex.apcs.projects.AsciiBox2;
import com.alex.apcs.projects.Ifs_Lab;
import com.alex.apcs.projects.Input;
import com.alex.apcs.projects.Lists_Lab;
import com.alex.apcs.projects.Loops_Lab;
import com.alex.apcs.projects.NestedLoops_Lab;
import com.alex.apcs.projects.Strings_Lab;
import com.alex.apcs.projects.Tests;
import com.alex.apcs.projects.Variables;
import com.alex.apcs.projects.oop.StarsAndStripes;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public enum ApcsProjectType {

	ARRAYS(new Array_Lab()),
	LISTS(new Lists_Lab()),
	ARRAY_LISTS(new ArrayList_Lab()),
	NESTED_LOOPS(new NestedLoops_Lab()),
	LOOPS(new Loops_Lab()),
	STRINGS(new Strings_Lab()),
	IFS(new Ifs_Lab()),
	TESTS(new Tests()),
	VARIABLES(new Variables()),
	ASCII_ART(new AsciiArt()),
	ALPHABET(new Alphabet()),
	INPUT(new Input()),
	ASCII_BOX(new AsciiBox()),
	ASCII_BOX2(new AsciiBox2()),
	STARS_AND_STRIPES(new StarsAndStripes());
	;
	
	private ApcsProject project;
	
	private ApcsProjectType(ApcsProject project) {
		this.project = project;
	}
	
	public ApcsProject getProject() {
		return project;
	}
	
	public void execute() {
		project.execute();
	}
}
