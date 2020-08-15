package com.udesk.spring_boot_demo.practice;

import java.security.KeyStore;
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Object> hash = new HashMap();
//        HashMap hash = new HashMap(77);
//        HashMap hash = new LinkedHashMap();
        hash.put("name","xyw");
        hash.put("gender",1);
        hash.put("gender",true);
        hash.put("age",12);
        hash.put("remove","remove()");
        hash.remove("remove");
        System.out.println(hash.containsKey("age"));
        System.out.println(hash.containsValue(true));

        Set<String> strings = hash.keySet();
        for(String s : strings){
            System.out.println(s);
        }

        Collection<Object> values = hash.values();
        values.forEach((e)-> System.out.println(e+" "+e.getClass()));

        Set<Entry<String,Object>> entries = hash.entrySet();
        for(Entry<String, Object> e : entries){
            String k = e.getKey();
            Object v = e.getValue();
            System.out.println(k+ "Entry"+v);
        }

//        hash.forEach((k,v)-> System.out.println(k+" "+v));


    }
}
