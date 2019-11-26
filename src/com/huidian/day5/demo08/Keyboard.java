package com.huidian.day5.demo08;/*
@outhor shkstart
@date 2019/11/23-21:27
*/

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘  ");
    }
    public void type(){
        System.out.println("键盘输入");
    }
}
