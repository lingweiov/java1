package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-11:40
匿名对象:只能使用一次
*/

public class Demo01Anonymous {
    public static void main(String[] args) {
    Person one=new Person();
        one.showName();
        one.name="张三";
        one.showName();
        System.out.println("匿名对象===========");
        new Person().name="李四";
        new Person().showName();
    }
}
