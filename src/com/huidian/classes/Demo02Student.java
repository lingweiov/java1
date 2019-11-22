package com.huidian.classes;/*
@outhor shkstart
@date 2019/11/20-20:55
*/

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        System.out.println("==============");
        Student stu2=new Student("张三",19);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());
   stu2.setAge(21);
        System.out.println("姓名："+stu2.getName()+",年龄："+stu2.getAge());



    }

}
