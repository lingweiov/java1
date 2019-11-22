package com.huidian.day2.demo02;/*
@outhor shkstart
@date 2019/11/21-10:07
局部变量和成员变量
1.定义的位置不一样
2.作用域不一样
3.默认值不一样
局部变量没有默认值
成员变量有默认值
4.内存的位置不一样（了解）
5.生命周期不一样（了解）
*/

public class Demo01VariableDifference {
String name;
public void method( ) {
    int num=21;
    System.out.println(num);
    System.out.println(name);

}
    /*public void method2( ) {
        int num;
        System.out.println(num);num没有赋值不能用
    }*///错误的 局部变量没有默认值
    public void method2(int param ) {

        System.out.println(name);
        System.out.println(param);//方法的参数也是局部变量，但是使用时会被赋值
    }
}
