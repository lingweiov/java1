package com.huidian.day4.demo02;/*
@outhor shkstart
@date 2019/11/23-9:39
*/

public class demoMain {
    public static void main(String[] args) {
        //Animal animal=new Animal();//错误写法，不能直接创建抽象类对象
      /*  new Animal() {
            @Override
            public void eat() {

            }
        };*/
        Cat cat = new Cat();
        cat.eat();
        System.out.println("============");
        // Dog dog=new Dog();//错误 Dog为抽象类
        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
        System.out.println("============");
        DogGolden golden = new DogGolden();
        golden.sleep();
        golden.eat();
    }
}
