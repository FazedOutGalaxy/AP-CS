package com.alex.apcs.projects.references.array;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Monster {

	private int height, width, age;
	
	public Monster(int height, int width, int age) {
		setMonster(height, width, age);
	}
	
	public void setMonster(int height, int width, int age) {
		setHeight(height);
		setWidth(width);
		setAge(age);
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getAge() {
		return age;
	}
	
}