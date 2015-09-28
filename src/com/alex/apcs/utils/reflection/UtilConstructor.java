package com.alex.apcs.utils.reflection;

public class UtilConstructor {

	public static Object invokeConstructor(Object obj, Object... params) {
		Class<?>[] cl = new Class<?>[params.length];
		for (int i = 0; i < (params.length); i++) {
			cl[i] = params[i].getClass();
		}
		
		if (params.length == 0 || cl.length == 0) {
			try {
				return obj.getClass().getConstructor().newInstance(params);
			} catch (Exception ex) {
				return null;
			}
		} else {
			try {
				return obj.getClass().getConstructor(cl).newInstance(params);
			} catch (Exception ex) {
				return null;
			}
		}
	}
}
