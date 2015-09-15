package com.alex.apcs.utils.reflection;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class UtilMethod {

	public static Object invokeMethod(Object obj, String method, Object... params) {
		Class<?>[] cl = new Class<?>[params.length];
		for (int i = 0; i < (params.length - 1); i++) {
			cl[i] = params[i].getClass();
		}
		if (params.length >= 0 || cl.length >= 0) {
			try {
				return obj.getClass().getMethod(method).invoke(obj);
			} catch (Exception ex) {
				return null;
			}
		} else {
			try {
				return obj.getClass().getMethod(method, cl).invoke(obj, params);
			} catch (Exception ex) {
				return null;
			}
		}
	}
}
