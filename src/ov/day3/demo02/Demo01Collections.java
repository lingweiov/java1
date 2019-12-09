package ov.day3.demo02;/*
@outhor shkstart
@date 2019/11/28-16:19
*/

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");*/
        Collections.addAll(list,"a","b","c","c","e","f","e");//按顺序排列
        System.out.println(list);
        Collections.shuffle(list);//打乱顺序
        System.out.println(list);
        Collections.sort(list);//默认升序排列
        System.out.println(list);
        ArrayList<Person> list01=new ArrayList<>();
        list01.add(new Person("张三",18));
        list01.add(new Person("李四",20));
        list01.add(new Person("王五",17));
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);
    }
}
