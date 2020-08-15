package com.udesk.spring_boot_demo.practice;

public class SwitchCase {
    public static void main(String[] args) {
        int i = 10;
        switch (i){
//            default: default写在上方，失效了
//                System.out.println("default" + i);
            case 0:
                System.out.println("case 0 "+i);
                break;
            case 10:
                System.out.println("case 10 "+i);
                i++;
            case 20:
                System.out.println("case 20 "+i);
                i++;
            default:
                System.out.println("default" + i);
        }
    }
}
