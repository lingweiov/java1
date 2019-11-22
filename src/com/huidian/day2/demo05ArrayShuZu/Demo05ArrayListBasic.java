package com.huidian.day2.demo05ArrayShuZu;/*
@outhor shkstart
@date 2019/11/21-20:42
*/

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println(list1);
        int num=list1.get(1);
        System.out.println(num);
    }
}
