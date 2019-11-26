package com.huidian.day3.demo10;/*
@outhor shkstart
@date 2019/11/22-23:35
*/

public class Zi extends Fu {
    int num = 20;
    public Zi(){
        super();
    }
    public void methodZi(){
        System.out.println(num);
        System.out.println(super.num);
    }
    public void method(){
        super.method();
        System.out.println("子类方法");
    }
}
