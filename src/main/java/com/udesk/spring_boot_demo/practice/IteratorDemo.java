package com.udesk.spring_boot_demo.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            int x = (int)it.next();
//            if (x==1){
//                it.remove();
//            }
//        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(i + " "+ list.get(i));
            if ((int)list.get(i) == 2){
                list.remove(i);
                i--;
            }
        }
    }
}
