package com.huidian.day3.demo05;/*
@outhor shkstart
@date 2019/11/22-17:47
*/

public class Zi extends Fu{
    int numZi=20;
    int num=200;
    public  void method(){
        super.method();
        System.out.println("子类方法");
    }
    public void show(){
        int num=30;
        System.out.println(num);//30
        System.out.println(this.numZi);//20
        System.out.println(super.numFu);//10
    }
    public  void methodZi(){

        System.out.println(num);
    }
}
