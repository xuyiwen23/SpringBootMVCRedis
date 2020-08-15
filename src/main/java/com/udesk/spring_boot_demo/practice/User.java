package com.udesk.spring_boot_demo.practice;

public class User {
    private int age;

    @AnnotationDemo
    private String name;

    public void  showAge(){
        System.out.println(age);
    }

    public void  showName(){
        System.out.println(name);
    }
}
