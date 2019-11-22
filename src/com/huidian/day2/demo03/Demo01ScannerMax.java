package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-10:33
题目：
键盘输入三个数字，然后求出最大值
思路：
1.用到scanner
2.scanner的三个步骤，导包，创建，使用nextInt（）方法
3.三个数字调用三次nextInt（）方法，得到三个变量
4.判断三个位数字那个最大，两个步骤
  4.1 判断前两个中的最大值
  4.2 拿得到的最大值和第三个比较
5.  打印最大值
*/

import java.util.Scanner;

public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int a=sc.nextInt();
        System.out.println("输入第二个数字：");
        int b=sc.nextInt();
        System.out.println("输入第三个数字：");
        int c=sc.nextInt();
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值："+max);
    }

}

