package com.huidian.day4.demo05;/*
@outhor shkstart
@date 2019/11/23-15:39
接口的实现类必须实现（覆盖重写）接口中所有的抽象方法，如果没有实现所有
抽象方法，那么这个实现类必须是抽象类（abstract)

*/

public class MyInterfaceImpl implements MyInterfaceAbstract{
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodAbs4() {
        System.out.println("这是第4个方法");

    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第3个方法");

    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第2个方法");

    }
}
