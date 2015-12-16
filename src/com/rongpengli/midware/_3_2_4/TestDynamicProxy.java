package com.rongpengli.midware._3_2_4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDynamicProxy {
	public static void testDynamicProxy() {
		Caculator caculator = new CaculatorImpl();
		LoginHandler lh = new LoginHandler(caculator);

		Caculator proxy = (Caculator) Proxy.newProxyInstance(caculator
				.getClass().getClassLoader(), caculator.getClass()
				.getInterfaces(), lh);
		System.out.println(proxy.add(1, 1));
	}

	public static void main(String[] args) {
		testDynamicProxy();
	}
}

class LoginHandler implements InvocationHandler {
	Object obj;

	public LoginHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		doBefore();
		Object o = method.invoke(obj, args);
		doAfter();
		return o;
	}

	public void doBefore() {
		System.out.println("do this before");
	}

	public void doAfter() {
		System.out.println("do this after");
	}
}