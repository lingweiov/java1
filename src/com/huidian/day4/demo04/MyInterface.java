package com.huidian.day4.demo04;/*
@outhor shkstart
@date 2019/11/23-14:44
*/

public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    public default void defaultMethod() {

    }
}
