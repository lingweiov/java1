package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-22:37
*/

public class Demo08String {
    public static void main(String[] args) {
        //和使用空参数构造
        String str1=new String();
        System.out.println(str1);
        //根据字符数组创建字符串
        char[] charArray={'A','S','D'};
        String str2=new String(charArray);
        System.out.println(str2);
        //根据字节数组创建字符串
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println(str3);
        //直接创建
        String str4="hello";
        System.out.println(str4);
    }


}
