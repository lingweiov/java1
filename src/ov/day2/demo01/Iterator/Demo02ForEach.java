package ov.day2.demo01.Iterator;/*
@outhor shkstart
@date 2019/11/27-11:45
增强for循环 循环目标只能是数组或集合
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Demo02ForEach {
    public static void main(String[] args) {
        demo011();
        System.out.println();
        System.out.println("==============");
        demo012();
    }

    private static void demo012() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("zzz");
        list.add("sss");
        list.add("xxx");
        for(String s:list){
            System.out.print(s+" ");
        }
    }

    private static void demo011() {
        int[] arr={1,2,3,4,5};
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
