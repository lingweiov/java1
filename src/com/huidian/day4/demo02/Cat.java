package com.huidian.day4.demo02;/*
@outhor shkstart
@date 2019/11/23-8:33
*/

public class Cat extends Animal {
    @Override
public void eat(){
    System.out.println("猫吃鱼");
}
public void sleep(){
    System.out.println("猫睡觉");
}
    public Cat() {
        System.out.println("子类方法执行");
    }
}
