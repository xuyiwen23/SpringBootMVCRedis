package com.udesk.spring_boot_demo.practice;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List array = new ArrayList();
        for (int i = 0; i < 11; i++) {
            array.add(i);
        }
//        System.out.println(array);

//        System.out.println(array.remove(10));
//        array.forEach((e) -> System.out.println(e));
//
//        Integer[] s = (Integer[]) array.toArray(new Integer[array.size()]);
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }

//        List list2 = new ArrayList(array);
        List list2 = new ArrayList();
        list2.add("c");
        list2.add("a");
        list2.add("b");

//        list2.addAll(array);//并集（不去重）set方法类似，set不允许重复，自动去重
//        list2.forEach((e)-> System.out.println(e));
//        list2.add(1);
//        list2.forEach((e)-> System.out.println(e));
//        list2.removeAll(array);//差集，去除list2中 的array的元素
//        list2.forEach((e)-> System.out.println(e));
//        list2.add(2);
//        list2.retainAll(array);
//        list2.forEach((e)-> System.out.println(e));//交集

//        Collections.sort(list2);
//        list2.forEach((e)-> System.out.println(e));
//          Collections.sort(list2, new Comparator<String>() {
//              @Override
//              public int compare(String o1, String o2) {
//                  int x =  Integer.valueOf(o2.charAt(0)) - Integer.valueOf(o1.charAt(0));
//                  return x;
//              }
//          });
//        list2.forEach((e)-> System.out.println(e));
    }
}
