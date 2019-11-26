package com.huidian.day4.demo01;/*
@outhor shkstart
@date 2019/11/23-9:09
*/

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Momber one = new Momber("成员1", 0);
        Momber two = new Momber("成员2", 0);
        Momber three = new Momber("成员3", 0);
        Momber four = new Momber("成员4", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("=================");
        ArrayList<Integer> redList=manager.send(23,4);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
    }
}
