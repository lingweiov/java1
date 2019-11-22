package com.huidian.demo01;/*
@outhor shkstart
@date 2019/11/20-23:02
*/

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("张三");
        stu1.setAge(21);
        System.out.println("姓名："+stu1.getName()+",年龄："+stu1.getAge());
        System.out.println("=============");
        Student stu2=new Student("李四",25);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());
stu2.setAge(35);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());

    }
}
