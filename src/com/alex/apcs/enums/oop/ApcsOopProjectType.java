package com.alex.apcs.enums.oop;

import java.awt.Canvas;

import com.alex.apcs.instances.oop.BigHouse;
import com.alex.apcs.instances.oop.Robot;
import com.alex.apcs.instances.oop.Shapes;
import com.alex.apcs.instances.oop.SmileyFace;

public enum ApcsOopProjectType {

	BIG_HOUSE(new BigHouse()),
	ROBOT(new Robot()),
	SMILEY_FACE(new SmileyFace()),
	SHAPES(new Shapes());
	
	private Canvas project;
	
	private ApcsOopProjectType(Canvas project) {
		this.project = project;
	}
	
	public Canvas getProject() {
		return project;
	}
}
