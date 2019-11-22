package com.huidian.day3.demo02;/*
@outhor shkstart
@date 2019/11/22-11:05
如果成员变量使用了static关键字，那么这个变量不再属于对象自己，
而是属于所在的类，多个对象共享同一份数据
*/

public class Demo01StaticField {
    public static void main(String[] args) {

        Stdent two = new Stdent("黄蓉", 32);
        two.room = "101教室";

        System.out.println("姓名：" + two.getName()
                + ",年龄：" + two.getAge() + "，教室：" + two.room
        +",学号："+two.getId());
        Stdent one = new Stdent("郭静", 34);
        System.out.println("姓名：" + one.getName()
                + ",年龄：" + one.getAge() + "，教室：" + one.room
                +",学号："+one.getId());
    }

}
