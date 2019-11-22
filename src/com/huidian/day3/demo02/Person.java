package com.huidian.day3.demo02;/*
@outhor shkstart
@date 2019/11/22-10:47
静态代码块
特点：当第一次用到本类时，静态代码块执行唯一的一次

*/

public class Person {
    static {
        System.out.println("静态代码块的执行");
    }

    public Person() {
        System.out.println("构造方法执行");
    }
}
