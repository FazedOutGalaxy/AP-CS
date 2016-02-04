package com.alex.apcs.projects.references.array;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Monsters {
	
	private Monster[] monsters;

	public Monsters() {
		setMonsters(0);
	}
	
	public Monsters(int size) {
		setMonsters(size);
	}
	
	public Monsters(Monster[] monsters) {
		setMonsters(monsters);
	}
	
	public void setMonsters(int size) {
		monsters = new Monster[size];
	}
	
	public void setMonsters(Monster[] monsters) {
		this.monsters = monsters;
	}

	public void add(int spot, Monster monster) {
		if (!(spot >= 0 || spot < monsters.length))
			return;
		Monster[] old = monsters;
		monsters = new Monster[old.length + 1];
		for (int i = 0; i < spot; i++)
			monsters[i] = old[i];
		for (int i = spot; spot < monsters.length; i++)
			monsters[i] = old[spot - 1];
	}
	
	public void set(int spot, Monster monster) {
		if (!(spot >= 0 || spot < monsters.length))
			return;
		monsters[spot] = monster;
	}

	public Monster getLargest() {
		Monster largest = null;
		int lSize = Integer.MIN_VALUE;
		for (Monster m : monsters) {
			int size = m.getWidth() * m.getHeight();
			if (size > lSize) {
				lSize = size;
				largest = m;
			}
		}
		return largest;
	}

	public Monster getSmallest() {
		Monster smallest = null;
		int sSize = Integer.MAX_VALUE;
		for (Monster m : monsters) {
			int size = m.getWidth() * m.getHeight();
			if (size < sSize) {
				sSize = size;
				smallest = m;
			}
		}
		return smallest;
	}

	public String toString() {
		return "";
	}
}