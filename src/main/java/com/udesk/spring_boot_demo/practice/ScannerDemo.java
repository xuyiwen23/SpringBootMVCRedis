package com.udesk.spring_boot_demo.practice;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next int");
        int i = scan.nextInt();
        System.out.println("string:");
        String string = scan.next();
        System.out.println(string+i);
    }
}
