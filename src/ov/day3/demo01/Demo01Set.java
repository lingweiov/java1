package ov.day3.demo01;/*
@outhor shkstart
@date 2019/11/28-14:13
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//set集合不能遍历重复的元素
        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            Integer s = it.next();
            System.out.println(s);//
        }
        System.out.println("==========================");
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
