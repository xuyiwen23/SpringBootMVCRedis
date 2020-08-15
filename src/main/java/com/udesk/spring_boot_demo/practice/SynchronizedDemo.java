package com.udesk.spring_boot_demo.practice;



public class SynchronizedDemo {
    static  int a = 0;
    static Object lock = new Object();

    public static void main(String[] args)  {


        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (lock){
                    System.out.println(a);
                    a++;
                    }

                }
            });
            thread.start();
        }




    }

}