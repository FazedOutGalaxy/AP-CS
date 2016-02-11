package com.alex.apcs.projects.references.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class NumberAnalyzer {
	private ArrayList<Number> list;

	public NumberAnalyzer() {
		list = new ArrayList<Number>();
	}

	public NumberAnalyzer(String numbers) {
		this();
		setList(numbers);
	}

	public void setList(String numbers) {
		for (String s : numbers.split("[\\s,]+"))
			list.add(new Number(Integer.parseInt(s)));
	}
	
	private Iterator<Number> getIterator() {
		return list.iterator();
	}

	public int countOdds() {
		int oddCount = 0;
		Iterator<Number> iter = getIterator();
		while (iter.hasNext())
			if (iter.next().isOdd())
				oddCount++;
		return oddCount;
	}

	public int countEvens() {
		int evenCount = 0;
		Iterator<Number> iter = getIterator();
		while (iter.hasNext())
			if (!iter.next().isOdd())
				evenCount++;
		return evenCount;
	}

	public int countPerfects() {
		int perfectCount = 0;
		Iterator<Number> iter = getIterator();
		while (iter.hasNext())
			if (!iter.next().isPerfect())
				perfectCount++;
		return perfectCount;
	}

	public String toString() {
		return list.toString();
	}
}