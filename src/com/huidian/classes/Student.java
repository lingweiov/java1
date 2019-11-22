package com.huidian.classes;/*
@outhor shkstart
@date 2019/11/20-20:49
构造方法
是专门用来创建对象的方法，当我们通过关键字new创建对象时，就是在调用构造方法
*/

public class Student {
    private String name;
    private int age;
public Student(){
    System.out.println("无参构造方法执行");
}
    public Student(String name,int age){
        System.out.println("有参构造方法执行");
        this.age=age;
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
