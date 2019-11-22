package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-22:47
对于基本类型来说，==是进行数值比较
对于引用类型来说，==是进行地值的址比较
*/

public class Demo08String02 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[] cA={'a','b','c'};
        String str3=new String(cA);
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }
}
