package com.alex.apcs.projects.references.advancedoop;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Monster {
	private String name;
	private int size;

	public Monster() {
		this("Raj", UtilRandomNumbers.getRandomInteger(5, 20));
	}

	public Monster(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public boolean isBigger(Monster other) {
		return getSize() > other.getSize();
	}

	public boolean isSmaller(Monster other) {
		return !isBigger(other);
	}

	public boolean hasSameName(Monster other, boolean ignoreCase) {
		return (ignoreCase) ? name.equalsIgnoreCase(other.getName()) : name.equals(other.getName());
	}

	public String toString() {
		return getName() + " " + getSize();
	}
}