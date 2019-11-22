package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-11:33
键盘输入两个数字，求和
*/

import java.util.Scanner;

public class Demo01ScannerSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("输入第一个数字：");
       int a= sc.nextInt();
        System.out.print("输入第二个数字：");
       int b= sc.nextInt();
      int  result=a+b;
        System.out.println("结果是："+result);

    }

}
