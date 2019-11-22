package com.huidian.day3.demo01;/*
@outhor shkstart
@date 2019/11/22-9:29
string当中与转换相关的常用方法
*/

public class Demo01StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + ",");
            }
        }

        System.out.println(chars.length);
        System.out.println("=================");
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=================");
        String str1 = "How do you do?";
      String str2=  str1.replace("o","*");
        System.out.println(str1);//How do you do?
        System.out.println(str2);//H*w d* y*u d*?
        System.out.println("=================");

    }
}
