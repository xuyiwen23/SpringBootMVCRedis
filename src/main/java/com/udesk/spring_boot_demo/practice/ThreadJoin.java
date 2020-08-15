package com.udesk.spring_boot_demo.practice;

public class ThreadJoin {
    static  int a = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                        System.out.println(a);
                        a++;
                }
            });
            thread.start();
            thread.join();
        }
    }
}