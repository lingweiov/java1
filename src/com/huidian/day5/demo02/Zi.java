package com.huidian.day5.demo02;/*
@outhor shkstart
@date 2019/11/25-9:15
*/

public class Zi extends Fu {
    int num=20;

    @Override
    public void showNum() {
        //super.showNum();
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }
    public void methodZi() {
        System.out.println("子类特有方法");
    }
}
