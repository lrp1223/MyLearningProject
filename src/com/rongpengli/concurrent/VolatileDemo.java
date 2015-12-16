package com.rongpengli.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class VolatileDemo {
    private int number = 0;

    private final ReentrantLock lock = new ReentrantLock();

    public int getNumber() {
        return number;
    }

    public void increase() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        lock.lock();
        try {
            number++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final VolatileDemo volDemo = new VolatileDemo();

        for (int i = 0; i < 500; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    volDemo.increase();
                }
            }).start();
        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println("number:" + volDemo.getNumber());
    }
}
