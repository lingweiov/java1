package com.huidian.day5.demo04;/*
@outhor shkstart
@date 2019/11/25-10:24
*/

public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        num1 = 20;
        System.out.println(num1);//20
        final int num2 = 200;
        System.out.println(num2);
        //num2=300;//错误写法，不能改变
        //num2=200;//错误写法,只能赋值一次
        final int num3;
        num3 = 300;//z正确写法，只要保证唯一一次赋值即可
        //num3=400;//错误写法,只能赋值一次
        Student stu1 = new Student("张三");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1 = new Student("李四");
        System.out.println(stu1);
        System.out.println(stu1.getName());//地址值发生改变
        final Student stu2=new Student("王五");
        System.out.println(stu2);
        System.out.println(stu2.getName());

        // stu2=new Student("6666");//final的引用类型不可改变，错误写法
        stu2.setName("66666");//地址值不可改变，赋值可变
        System.out.println(stu2);
        System.out.println(stu2.getName());

    }

}
