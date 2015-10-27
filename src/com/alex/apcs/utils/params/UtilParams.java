package com.alex.apcs.utils.params;

import java.util.Arrays;
import java.util.List;

public final class UtilParams {

	private Object[] params;
	public int length;
	private List<Object> objects;
	
	public static final UtilParams forParams(Object... params) {
		return new UtilParams(params);
	}
	
	private UtilParams(Object[] params) { 
		this.params = params;
		this.length = params.length;
		this.objects = Arrays.asList(params);
	}
	
	public Object read(int index) {
		return params[index];
	}
	
	public void write(Object object) {
		objects.add(object);
		this.params = objects.toArray();
	}
	
	public void write(int index, Object object) {
		objects.add(index, object);
		this.params = objects.toArray();
	}
	
	public boolean contains(Object object) {
		return objects.contains(object);
	}
	
	public boolean parse(int index, Class<?> oclass) {
		return (read(index).getClass() == oclass);
	}
	
	public Object[] getParameters() {
		return params;
	}
	
	public List<Object> getList() {
		return objects;
	}
}
