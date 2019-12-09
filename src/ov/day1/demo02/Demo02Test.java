package ov.day1.demo02;/*
@outhor shkstart
@date 2019/11/26-17:59
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式：yyyy-MM-dd");
        String birthDayDateString = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdateDate = sdf.parse(birthDayDateString);
        long birthdateDateTime = birthdateDate.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime - birthdateDateTime;
       long  t=time / 1000 / 60 / 60 / 24;
        System.out.println(t/365+"年"+t%365/30+"月"+t%365%30+"天" );

    }
}
