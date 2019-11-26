package com.huidian.day4.demo02;/*
@outhor shkstart
@date 2019/11/23-9:34
*/

public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();

    public Animal() {
        System.out.println("抽象父类构造方法执行");
    }
}
