package com.huidian.day6.demo02;/*
@outhor shkstart
@date 2019/11/26-9:00
内部类
*/

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.setName("张三");
        body.method();
        System.out.println("==================");
        Body.Heart heart=new Body().new Heart();

        heart.beat();
    }
}
