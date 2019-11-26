package com.huidian.day4.demo05;/*
@outhor shkstart
@date 2019/11/23-16:00
*/



public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();
        System.out.println("==================");
        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
