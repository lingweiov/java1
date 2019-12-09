package ov.day1.demo02;/*
@outhor shkstart
@date 2019/11/26-21:03
*/

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo011();
        demo012();
        demo013();
        demo014();

    }

    private static void demo014() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    private static void demo013() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    private static void demo012() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 9999);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DATE,9);
        c.set(8888,8,8);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    private static void demo011() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
}
