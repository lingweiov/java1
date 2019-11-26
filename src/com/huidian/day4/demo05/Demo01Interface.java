package com.huidian.day4.demo05;/*
@outhor shkstart
@date 2019/11/23-15:17
*/

public class Demo01Interface {
    public static void main(String[] args) {
       // MyInterfaceAbstract inter=new MyInterfaceAbstract();
        //不能直接new接口对象使用
        MyInterfaceImpl impl=new MyInterfaceImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
