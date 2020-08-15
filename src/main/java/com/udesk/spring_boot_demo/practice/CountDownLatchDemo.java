package com.udesk.spring_boot_demo.practice;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    static  int a = 0;

    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        CountDownLatch c0 = new CountDownLatch(0); //计数器为0
        list.add(c0);
        for (int i = 0; i < 10; i++) {
            CountDownLatch c1 = new CountDownLatch(1); //计数器为1
            list.add(c1);
        }
        CountDownLatch c2 = new CountDownLatch(0); //计数器为0
        list.add(c2);

        for (int i = 0;i< list.size()-1;i++) {
            CountDownLatch cc0 = (CountDownLatch)list.get(i);
            CountDownLatch cc1 = (CountDownLatch)list.get(i+1);

            Thread t1 = new Thread(new Work(cc0, cc1));
            t1.start();
        }

    }

    static class Work implements Runnable{
        CountDownLatch c1;
        CountDownLatch c2;

        Work(CountDownLatch c1, CountDownLatch c2) {
            super();
            this.c1 = c1;
            this.c2 = c2;
        }
        @Override
        public void run() {
            try {
                c1.await();
                System.out.println(a);
                a++;
                c2.countDown();
            } catch (InterruptedException e) {
            }


        }
    }
}

