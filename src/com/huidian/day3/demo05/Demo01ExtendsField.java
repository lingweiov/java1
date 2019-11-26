package com.huidian.day3.demo05;/*
@outhor shkstart
@date 2019/11/22-22:21
*/

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);
        System.out.println("==================");
        System.out.println(zi.num);
        zi.methodZi();
        zi.methodFu();

    }
}
