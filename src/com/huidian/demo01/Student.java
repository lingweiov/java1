package com.huidian.demo01;/*
@outhor shkstart
@date 2019/11/20-22:50
类的总结
1.所有的成员变量都要用private关键字修饰
2，为每一个成员变量编写一对getter/setter方法（获取和设置）
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
这样就是一个标准的类也叫java bean
*/

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
