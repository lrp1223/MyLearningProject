package com.rongpengli.concurrent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

class DaemonThread implements Runnable {
    @Override
    public void run() {
        System.out.println("进入守护线程：" + Thread.currentThread().getName());
        try {
            writeToFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("退出守护线程：" + Thread.currentThread().getName());
    }

    private void writeToFile() throws IOException, InterruptedException {
        File file = new File("\\Users\\rongpengli\\Downloads\\daemon");
        OutputStream os = new FileOutputStream(file, true);
        int count = 0;
        while (count < 19) {
            os.write(("\r\nword" + count).getBytes());
            System.out.println("守护线程" + Thread.currentThread().getName() + "向文件写入了word" + count++);
            Thread.sleep(1000);
        }
        os.close();
    }
}

public class DaemonThreadDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DaemonThread daemon = new DaemonThread();
        Thread thread = new Thread(daemon);
        thread.setDaemon(true);
        thread.start();

        Scanner sc = new Scanner(System.in);
        sc.next();

    }

}
