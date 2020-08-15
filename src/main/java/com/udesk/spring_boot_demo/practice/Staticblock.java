package com.udesk.spring_boot_demo.practice;

public class Staticblock {

    static class A {
        static  int a = 10;
        int b = 20;
        static {
            System.out.println("A static block");
        }

        {
            System.out.println("A block");
        }
        public A (){
            System.out.println("A construc");
        }
    }

    static  class B extends  A {
        static {
            System.out.println("B static block");
        }

        {
            System.out.println("B block");
        }
        public B (){
            System.out.println("B construc");
        }
    }

    public static void main(String[] args) {
//        new A();
//        new B();
//        B b = new B();
//        System.out.println(b.a);
//        b.a = 40;
//        System.out.println(b.a);
//        System.out.println(new A().a);

        B b = new B();
        System.out.println(b.b);
        b.b = 40;
        System.out.println(b.b);
        System.out.println(new A().b);
    }
}
