package com.huidian.day3.demo01;/*
@outhor shkstart
@date 2019/11/22-9:46
分割字符串的方法
*/

public class Demo01SpringSplit {
    public static void main(String[] args) {
        String str1 = "aaaa,bbbb,cccc,d";
        String[] arr1 = str1.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("=================");
        String str2 = "aaaa bbbb cccc d";
        String[] arr2 = str2.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("=================");

        String str3 = "xxxx.yyyy.zzzzz";
        String[] arr3 = str3.split("\\.");
        System.out.println(arr3.length);//0
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
