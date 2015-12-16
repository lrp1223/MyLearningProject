package com.rongpengli.midware;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {

	public static int count = 200000;

	public static void test() {
		long startTime = System.currentTimeMillis();
		final List<Integer> l = new LinkedList<Integer>();
		final Random random = new Random();

		ThreadPoolExecutor tp = new ThreadPoolExecutor(1, 1, 60,
				TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(count));
		for (int i = 0; i < count; i++) {
			tp.execute(new Runnable() {

				@Override
				public void run() {
					l.add(random.nextInt());

				}
			});
		}
		tp.shutdown();
		try {
			tp.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println(l.size());
	}

	public static void testWithoutThreadPool() {
		long startTime = System.currentTimeMillis();
		final List<Integer> l = new LinkedList<Integer>();
		final Random random = new Random();

		for (int i = 0; i < count; i++) {
			Thread thread = new Thread() {
				@Override
				public void run() {
					l.add(random.nextInt());
				}
			};
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println(l.size());
	}

	public static void testExchanger() {
		final Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();
		new Thread() {
			@Override
			public void run() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(1);
				l.add(2);
				try {
					l = exchanger.exchange(l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread1" + l);
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(4);
				l.add(5);
				try {
					l = exchanger.exchange(l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread2" + l);
			}
		}.start();
	}

	public static void main(String[] args) {
		// test();
		// System.out.println("-----");
		// testWithoutThreadPool();
		testExchanger();
	}
}
