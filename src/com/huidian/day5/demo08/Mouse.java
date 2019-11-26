package com.huidian.day5.demo08;/*
@outhor shkstart
@date 2019/11/23-21:27
*/

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
