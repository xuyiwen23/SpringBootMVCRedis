package com.udesk.spring_boot_demo.practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class clazz = Class.forName("com.udesk.spring_boot_demo.practice.User");
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (int i = 0; i < declaredMethods.length; i++) {
//            System.out.println(declaredMethods[i]);
//        }

        Object o = clazz.newInstance();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            Annotation annotation = field.getAnnotation(AnnotationDemo.class);
            if (annotation != null){
//                Class<?> type = field.getType();
//                Object object = type.newInstance();
                String name = "xyw";
                field.setAccessible(true);
                field.set(o,name);
            }
        }
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.invoke(o);
        }
    }
}
