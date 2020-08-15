package com.udesk.spring_boot_demo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add("l");
        c.add("o");
        c.add("v");
        c.add("e");

        List d = Arrays.asList("0","1","2","3","4","5","6","7","e");
//        System.out.println("original:"+c);

//        Collections.sort(c);
//        System.out.println("sort:"+c);

//        Collections.reverse(c);
//        System.out.println("reverse:"+c);

//        List d = Arrays.asList("0","1","2","3","4","5","6","7");
//        Collections.copy(d,c);
//        System.out.println(d);

//        String min = (String) Collections.min(d);
//        System.out.println(min);
//        String max = (String) Collections.max(c);
//        System.out.println(max);

//        List e = Arrays.asList("e");
//        Integer index = Collections.indexOfSubList(d,e);
//        System.out.println(index);

//        Collections.rotate(d,-2);
//        System.out.println(d);
//        Collections.rotate(c,3);
//        System.out.println(c);

//        Collections.swap(d,3,8);
//        System.out.println(d);

        Collections.replaceAll(d,"e","v");
        System.out.println(d);
    }
}
