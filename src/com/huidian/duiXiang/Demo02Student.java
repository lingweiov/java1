package com.huidian.duiXiang;/*
@outhor shkstart
@date 2019/11/20-23:53
通常情况下类不能直接使用，需要根据类创建一个对象才能使用
创建对象过程：
1.导包：导出需要的类的位置
2.创建：Student stu1=new Student();根据student类创建了stu1的对象
3.使用:分两种情况
a.如何使用成员变量： 对象名.成员变量名
b.如何使用成员方法： 对象名.成员方法名（参数）
*/

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        //使用成员变量
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println("============");
        stu1.name="张三";
        stu1.age=17;

        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println("============");
        //使用成员方法
        stu1.eat();
        stu1.sleep();
        stu1.study();



    }


}
