package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-17:28
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(1);
        list01.add(2);
        ArrayList<String> list02=new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

        //ArrayList<?> list03=new ArrayList<?>();//错误使用
        // 定义时泛型通配符不能使用，参数传递时可以使用


    }
    public static void printArray( ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

    }
}
