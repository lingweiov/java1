package com.huidian.day3.demo03;/*
@outhor shkstart
@date 2019/11/22-15:48
*/




public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room="101教室";
        Student one=new Student("郭靖",20);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        System.out.println("one的教室："+Student.room);
        System.out.println("============================");
        Student two=new Student("黄蓉",17);
        System.out.println("two的姓名："+two.getName());
        System.out.println("two的年龄："+two.getAge());
        System.out.println("two的教室："+Student.room);
    }
}
