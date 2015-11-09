package com.alex.apcs.projects.switchcase;

public class Monster {
	
	private String name;
	private int size;

	public Monster(String name, int size) {
		setName(name);
		setSize(size);
	}
	
	public String setName(String name) {
		String previous = this.name;
		this.name = name;
		return previous;
	}
	
	public int setSize(int size) {
		int previous = this.size;
		this.size = size;
		return previous;
	}

	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isBigger(Monster other) {
		return size > other.size;
	}
	
	public boolean isSmaller(Monster other) {
		return !isBigger(other);
	}

	public boolean hasSameName(Monster other, boolean ignoreCase) {
		return ignoreCase ? name.equalsIgnoreCase(name) : name.equals(other.name);
	}
	
	public String toString() {
		return name + " " + size;
	}
}