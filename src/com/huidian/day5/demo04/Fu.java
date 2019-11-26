package com.huidian.day5.demo04;/*
@outhor shkstart
@date 2019/11/25-10:32
*/

public abstract class Fu {
    public final void method(){
        System.out.println("父类方法执行");
    }
    public abstract /*final */void methodAbs();//final和abstract不能同时使用
}
