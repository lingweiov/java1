package com.huidian.day4.demo04;/*
@outhor shkstart
@date 2019/11/23-11:10
*/

public interface MyInterfaceB {

    public abstract void methodB();
    public abstract void methodCommon();
    public default void defaultMethod(){
        System.out.println("BBB");
    }
}
