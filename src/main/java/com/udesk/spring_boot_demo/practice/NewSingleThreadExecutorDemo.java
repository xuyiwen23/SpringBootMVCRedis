package com.udesk.spring_boot_demo.practice;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorDemo {
    static  int a = 0;
    static Executor service = Executors.newSingleThreadExecutor();

    public static void main(String[] args)  {

        for (int i = 0; i < 100; i++) {
           Thread t =  new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(a);
                    a++;
                }
            });

           service.execute(t);
        }

    }
}