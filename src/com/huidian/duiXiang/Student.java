package com.huidian.duiXiang;/*
@outhor shkstart
@date 2019/11/20-20:49
定义一个类：用来模拟“学生”事物，其中有两部分组成
1.属性：姓名，年龄
2.行为：吃饭，睡觉，学习
对应到Java类中:
成员变量（属性）
String name;
      int age;
成员方法（行为）
public void eat(){}
    public void sleep(){}
    public void study(){}
    成员变量是直接定义在类中的，定义在方法外
    成员方法不要写关键字
  */

public class Student {
      String name;
      int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }


}
