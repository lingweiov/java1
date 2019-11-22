package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-23:15
string当中与获取相关的常用方法
*/

public class Demo02StringGet {

    public static void main(String[] args) {
        //获取字符串的长度
        int length = "asadjsahdfkhgdajfhg".length();
        System.out.println(length);
        System.out.println("=========");
        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=========");
        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println(ch);
        System.out.println("=========");
//查找参数字符串在本来字符串当中出现的第一次索引位置。
// 如果根本没有，返回-1值
        String ben = "HelloWorldHelloWorld";
        int index = ben.indexOf("llo");
        System.out.println(index);
        int index1=ben.indexOf("po");
        System.out.println(index1);
        System.out.println("=========");




    }
}
