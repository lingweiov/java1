package ov.day1.demo01;/*
@outhor shkstart
@date 2019/11/26-11:46
*/

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1=new Person("迪丽热巴",18);
        Person p2=new Person("迪丽热巴",18);
       // p1=p2;
        ArrayList<String> list=new ArrayList<>();
        System.out.println("p1="+p1);
        System.out.println("p2="+p2);
       // boolean a=p1.equals(list);
       //boolean a=p1.equals(null);
        boolean a=p1.equals(p2);
        System.out.println(a);
    }
}
