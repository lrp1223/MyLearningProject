package com.rongpengli.concurrent;

public class SynchronizedDemo {
    private boolean ready = false;
    private int result = 0;
    private int number = 1;

    public void write() {
        ready = true;
        number = 2;
    }

    public void read() {
        if (ready) {
            result = number * 3;
        }
        System.out.println("Result的值是：" + result);
    }

    private class ReadWriteThread extends Thread {
        private final boolean flag;

        public ReadWriteThread(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            if (flag) {
                write();
            } else {
                read();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo synDemo = new SynchronizedDemo();
        synDemo.new ReadWriteThread(true).start();
        synDemo.new ReadWriteThread(false).start();
    }
}
