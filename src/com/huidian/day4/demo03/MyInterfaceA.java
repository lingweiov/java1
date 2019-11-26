package com.huidian.day4.demo03;/*
@outhor shkstart
@date 2019/11/23-11:10
*/

public interface MyInterfaceA {
    //接口不能有静态代码块
   // static {}//错误
    //接口不能有构造方法
   // public MyInterfaceA(){}
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }

}
