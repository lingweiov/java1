package com.huidian.day2.demo01;/*
@outhor shkstart
@date 2019/11/21-9:00
*/


public class PhoneSame {
    public static void main(String[] args) {
        Phone one=new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==========");
        one.brand="苹果";
        one.color="黑色";
        one.price=8760.9;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==========");

        one.call("张三");
        one.sendMessage();

        System.out.println("================");
        Phone two=one;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==========");
        two.brand="华为";
        two.color="土豪金";
        two.price=5760.9;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==========");

        two.call("李四");
        two.sendMessage();
    }
}
