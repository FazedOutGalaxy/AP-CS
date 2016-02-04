package com.alex.apcs.projects.references.array;

import java.util.Arrays;

/**
 * 
 * @author Alex Chiang
 *
 */
public class Doggies {
	
	private Dog[] pups;

	public Doggies(int size) {
		pups = new Dog[size];
	}

	public void set(int spot, int age, String name) {
		if (spot <= 0 && spot > pups.length)
			pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest() {
		Dog oldest = null;
		int age = Integer.MIN_VALUE;
		for (Dog d : pups) {
			if (d.getAge() > age) {
				oldest = d;
				age = d.getAge();
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest() {
		Dog youngest = null;
		int age = Integer.MAX_VALUE;
		for (Dog d : pups) {
			if (d.getAge() < age) {
				youngest = d;
				age = d.getAge();
			}
		}
		return youngest.getName();
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}