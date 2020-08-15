package com.udesk.spring_boot_demo.practice;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    static  int a = 0;
    static java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock(false);


    public static void main(String[] args)  {

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    System.out.println(a);
                    a++;
                    lock.unlock();
                }
            }).start();
        }

    }
}