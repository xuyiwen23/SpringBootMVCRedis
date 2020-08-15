package com.udesk.spring_boot_demo.practice;

public class StringDemo {
    public static void main(String[] args) {
        String a = "abc";
        String b = "a" + "bc";
        String c = new String("abc");
        String d = new String(a);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);

        char ch = a.charAt(1);
        System.out.println(ch);
        int index = a.indexOf("b");
        System.out.println(index);

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}
