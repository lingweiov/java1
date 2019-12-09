package ov.day3.demo04;/*
@outhor shkstart
@date 2019/11/28-22:01
*/

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo0LinkedHashMap {
    public static void main(String[] args) {
        show01();
        show02();

    }

    private static void show02() {
        LinkedHashMap<String,String> Linked=new LinkedHashMap<>();
        Linked.put("a","a");
        Linked.put("c","c");
        Linked.put("b","b");
        Linked.put("a","d");
        System.out.println(Linked);//key不允许重复，有序即和存储是顺序一样
    }

    private static void show01() {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//key不允许重复，无序即和存储是顺序不一样
    }
}
