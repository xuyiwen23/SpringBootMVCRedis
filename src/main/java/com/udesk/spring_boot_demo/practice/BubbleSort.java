package com.udesk.spring_boot_demo.practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i<arr.length;i++) {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();//输入完毕
        for(int i = 0;i<arr.length-1;i++) {//冒泡排序
            for(int j = 0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {//升序
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }//升序完毕
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }//编历输出
    }
}
