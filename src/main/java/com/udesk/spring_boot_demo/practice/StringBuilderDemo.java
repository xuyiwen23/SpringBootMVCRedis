package com.udesk.spring_boot_demo.practice;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String string = "努力学习java";
        StringBuilder builder = new StringBuilder(string);
//        for (int i = 0; i < builder.length(); i++) {
//            System.out.println(builder.charAt(i));
//        }

        builder.append("for what do java");
        System.out.println(builder.toString());

        builder.replace(0,5,"replace");
        System.out.println(builder.toString());

        builder.delete(0, 8);
        System.out.println(builder.toString());

        builder.insert(0, "活着");
        System.out.println(builder.toString());
    }
}
