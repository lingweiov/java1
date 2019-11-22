package com.huidian.classes;/*
@outhor shkstart
@date 2019/11/20-20:32
this.name///通过谁调用的方法，谁就是this
*/

public class Person {
    String name;
    public void sayHello(String name ) {
        System.out.println(name+",你好，我是"+this.name);
        System.out.println(this);
    }
}
