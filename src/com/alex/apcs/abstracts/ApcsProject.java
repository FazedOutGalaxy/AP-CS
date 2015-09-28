package com.alex.apcs.abstracts;

import java.util.List;
import java.util.Locale;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public abstract class ApcsProject {
	
	public ApcsProject() {}
	
	public abstract void execute();
	
	protected final void printLine(Object... arg0) {
		if (arg0.length == 0) {
			System.out.println();
		}
		for (Object obj : arg0) {
			System.out.println(obj);
		}
	}
	
	protected final void print(Object... arg0) {
		for (Object obj : arg0) {
			System.out.print(obj);
		}
	}
	
	protected final void printFormatted(String form, Object... obj) {
		System.out.printf(form, obj);
	}
	
	protected final void printFormatted(Locale loc, String form, Object... obj) {
		System.out.printf(loc, form, obj);
	}
	
	protected final void remove(List<?> e, Object obj) {
		e.remove(obj);
	}
	
	protected final void remove(List<?> e, int index) {
		e.remove(index);
	}
	
	protected final void add(List e, Object obj) {
		e.add(obj);
	}
	
	protected final void add(List e, int index, Object obj) {
		e.add(index, obj);
	}
	
	protected final Object get(List<?> e, int index) {
		return e.get(index);
	}
	
	protected final void set(List e, int index, Object obj) {
		e.set(index, obj);
	}
}
