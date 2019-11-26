package com.huidian.day3.demo03;/*
@outhor shkstart
@date 2019/11/22-11:52
*/

public class MyClass {
    int num;
    static int numStatic;
    public void method(){
        System.out.println(num);
        System.out.println(numStatic);
        System.out.println("这是一个普通的成员方法");
    }
    public static void methodStatic( ) {
        System.out.println(numStatic);
        //System.out.println(num);静态不能直接访问非静态
       // System.out.println(this);静态方法中不能使用this关键字
        System.out.println("这是一个静态方法");
    }
}
