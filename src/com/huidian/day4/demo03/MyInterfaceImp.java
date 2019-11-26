package com.huidian.day4.demo03;/*
@outhor shkstart
@date 2019/11/23-11:24
*/

public class MyInterfaceImp extends Object implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB都有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

}
