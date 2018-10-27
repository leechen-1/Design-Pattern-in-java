package com.ibeifeng.news;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private RealSubject realSubject;
	
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	public Object invoke(Object proxy, Method method, Object[] args){
		Object result = null;
		dazhe();
		try {
			result = method.invoke(realSubject, args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		give();
		return result;
	}
	
	public void dazhe() {
		System.out.println("´òÕÛ");
	}
	
	public void give() {
		System.out.println("ÔùËÍ´ú½ðÈ¯");
	}

}
