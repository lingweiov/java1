package ov.day3.demo01;/*
@outhor shkstart
@date 2019/11/28-15:48
*/

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//无序的不允许重复
        LinkedHashSet<String> Linked=new LinkedHashSet<>();
        Linked.add("www");
        Linked.add("abc");
        Linked.add("abc");
        Linked.add("itcast");
        System.out.println(Linked);//有序的不允许重复
    }
}
