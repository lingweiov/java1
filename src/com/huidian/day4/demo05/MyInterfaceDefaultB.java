package com.huidian.day4.demo05;/*
@outhor shkstart
@date 2019/11/23-15:54
*/

public class MyInterfaceDefaultB implements MyInterfaceDeault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}
