package com.huidian.day4.demo03;/*
@outhor shkstart
@date 2019/11/23-11:54
*/

public interface MyInterface {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}
