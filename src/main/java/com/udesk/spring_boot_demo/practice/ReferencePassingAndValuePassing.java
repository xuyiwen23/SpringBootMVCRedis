package com.udesk.spring_boot_demo.practice;

public class ReferencePassingAndValuePassing {
    /**
     * 8种基本类型是值传递
     * 对象的引用传递
     */
    public static void main(String[] args) {
        int a = 1200;
        String s = "abc";
        char[] chars = {'q','w','e'};

        System.out.println(a);
        System.out.println(s);
        System.out.println(chars);
    }

    public static void change(int a,String s,char[] c){
        a = 10;
        s = "aaaaa";
        c[0]='t';
    }
}
