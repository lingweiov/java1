package com.huidian.day5.demo07;/*
@outhor shkstart
@date 2019/11/25-15:16
*/

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵四");
        return list;
    }
}
