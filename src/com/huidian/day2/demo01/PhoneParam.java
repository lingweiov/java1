package com.huidian.day2.demo01;/*
@outhor shkstart
@date 2019/11/21-9:25
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class PhoneParam {
    public static void main(String[] args) {
        Phone one=new Phone();

        one.brand="苹果";
        one.color="黑色";
        one.price=8760.9;
       mehod(one);
    }
    public static void mehod(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
        param.sendMessage();
        param.call("李四");
    }
}
