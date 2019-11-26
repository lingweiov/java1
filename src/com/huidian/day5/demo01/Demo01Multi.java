package com.huidian.day5.demo01;/*
@outhor shkstart
@date 2019/11/25-8:59
代码当中的多态性，就是父类引用指向子类对象
格式：
父类名称 对象名=new 子类名称（）；
或者：
接口名称 对象名=new 实现类名称（）；
*/

public class Demo01Multi {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();
        obj.methodFu();
    }

}
