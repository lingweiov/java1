package ov.day1.demo02;/*
@outhor shkstart
@date 2019/11/26-16:28
*/

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //获取系统当前时间到1970年1月1日经历了多少毫秒（long型）
       //1day=86400s=86400*1000ms
      long b= (System.currentTimeMillis())/(86400*1000);
        System.out.println(b/365);
        System.out.println(b%365/30);
        System.out.println(b%365%30);
    }
}
