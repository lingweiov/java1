package com.huidian.day2.demo01;/*
@outhor shkstart
@date 2019/11/21-9:00
*/


public class PhoneOne {
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

    }
}
