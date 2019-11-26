package com.huidian.day3.demo04;/*
@outhor shkstart
@date 2019/11/22-17:31
*/

public class Demo03Math {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-3.5));//3.5
        System.out.println("============");
        //向上取整
        System.out.println(Math.ceil(3.4));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println(Math.ceil(-3.4));//-3.0
        System.out.println(Math.ceil(-3.0));//-3.0
        System.out.println("============");

        //向下取整,小数位之后取0
        System.out.println(Math.floor(3.12));//3.0
        System.out.println(Math.floor(31.2));//31.0
        System.out.println("============");

//四舍五入,取整
        System.out.println(Math.round(3.4));//3
        System.out.println(Math.round(3.164));//3
        System.out.println(Math.round(3.764));//4
        System.out.println("============");

        System.out.println(Math.PI);
    }
}
