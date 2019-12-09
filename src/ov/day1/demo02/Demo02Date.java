package ov.day1.demo02;/*
@outhor shkstart
@date 2019/11/26-16:46
*/


import java.util.Date;

public class Demo02Date {


    public static void main(String[] args) {
        demo011();
        demo012();
        demo013();
    }

    private static void demo013() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo012() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    private static void demo011() {
        Date date = new Date();
        System.out.println(date);
    }
}
