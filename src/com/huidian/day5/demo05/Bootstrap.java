package com.huidian.day5.demo05;/*
@outhor shkstart
@date 2019/11/25-15:25
*/

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("ov练习");
        red.setOwnerName("张三");
        OpenMode normal = new NormalMode();
        red.setOpenMode(normal);
    }
}
