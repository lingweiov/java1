package com.huidian.day5.demo03;/*
@outhor shkstart
@date 2019/11/25-9:42
*/

public class Demo01Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        Cat cat = (Cat) animal;
        cat.catchMouse();
        // Dog dog=(Dog)animal;//编译不会保错，运行报错，类转换异常 :ClassCastException
        int num = (int) 10.5;
        System.out.println(num);//10,精度损失
    }
}
