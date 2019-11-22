package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-22:57
*/

public class Demo01StringEquals {
    public static void main(String[] args) {
        //严格比较
        String str1="Hello";
        String str2="Hello";
        char[] cA={'H','e','l','l','o'};
        String str3=new String(cA);
        System.out.println(str1.endsWith(str2));//true
        System.out.println(str2.endsWith(str3));//true
        System.out.println(str3.endsWith(str1));//true
        System.out.println(str3.endsWith("Hello"));//true建议不使用，
        // 因为当str3=null时报错：nullPointException:空指针异常
        System.out.println("Hello".endsWith(str1));//true推荐使用
        System.out.println("============");
        //忽略英文字母大小写进行比较
        String str4="JAVA";
        String str5="java";
        System.out.println(str4.equals(str5));//false
        System.out.println(str4.equalsIgnoreCase(str5));//true


    }
}
