package com.huidian.day6.demo02;/*
@outhor shkstart
@date 2019/11/26-9:00
内部类
*/

public class Demo02InnerClass {
    public static void main(String[] args) {
       Outer.Inner  obj=new Outer().new Inner();
       obj.methodInner();
    }
}
