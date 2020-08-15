package com.udesk.spring_boot_demo.practice;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)Math.random()*100;
        }

        Random r = new Random();
        int[] b = new int[20];
        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextInt(100);
        }
    }
}
