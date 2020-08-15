package com.udesk.spring_boot_demo.practice;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List array = new ArrayList();
        array.add("a");
        array.add("c");
        array.add("a");
        array.add("b");
//        Set set = new HashSet(array);
        Set set = new LinkedHashSet(array);
        set.forEach((e)-> System.out.println(e));
    }
}
