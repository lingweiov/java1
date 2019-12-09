package ov.day8.ObjectStream;/*
@outhor shkstart
@date 2019/12/4-16:38
InvalidClassException:序列号不同导致的异常
*/

import java.io.Serializable;

public class Person implements Serializable{
     static final long serialvsionUID=11;//定义自己的序列化，该类在改变时亦可以反序列化
    private String name;
    //private /*static*/transient int age;
    /*public*/  private int age;
    //被static或transient修饰的成员变量不能被序列化

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
