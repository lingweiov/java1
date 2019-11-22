package com.huidian.day3.demo02;/*
@outhor shkstart
@date 2019/11/22-10:54
静态代码块
特点：当第一次用到本类时，静态代码块执行唯一的一次
静态代码块先与构造方法执行
静态代码块的用途：用来一次性的对静态成员变量进行赋值
*/

public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
