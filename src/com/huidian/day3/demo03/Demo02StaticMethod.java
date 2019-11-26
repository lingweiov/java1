package com.huidian.day3.demo03;/*
@outhor shkstart
@date 2019/11/22-11:56
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
*/

public class Demo02StaticMethod {
    public static void main(String[] args) {
MyClass obj=new MyClass();
obj.method();
obj.methodStatic();//不建议使用
MyClass.methodStatic();
myMethod();
    }
    public static void myMethod( ) {
        System.out.println("自己的方法");
    }
}
