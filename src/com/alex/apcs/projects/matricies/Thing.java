package com.alex.apcs.projects.matricies;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

//make a Thing class that stores the following 3 instance variables
public class Thing {
	
	// make a String to store type
	private String type;
	// make a String to store name
	private String name;
	// make a double to store size
	private double size;

	//add a constrcutor
	public Thing() {
		
	}
	
	//add set methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	//add get methods
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public double getSize() {
		return size;
	}
	
	//add a toString 
	@Override
	public String toString() {
		
	}
}