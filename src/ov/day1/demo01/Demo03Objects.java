package ov.day1.demo01;/*
@outhor shkstart
@date 2019/11/26-16:20
*/

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
       // String s1=null;
        String s1="abc";
        String s2="abc";
        /*boolean b = s1.equals(s2);
        System.out.println(b);*/
        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
    }
}
