package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-11:50
匿名对象的方式
*/

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
////       int num=sc.nextInt();
//        System.out.print("只能用一次的数字：");
//      int num=new Scanner(System.in).nextInt();
//        System.out.println("只能输入一次的数字是："+num);
        //一般写法
//        Scanner sc= new Scanner(System.in);
//        methodParam(sc);
        //匿名对象直接传参
      //  methodParam(new Scanner(System.in));
        Scanner sc = methodReturu();
        System.out.println("输入一个数字:");
        int num =sc.nextInt();
        System.out.println("输入的一个数字是:"+num);


    }
    public static void methodParam(Scanner sc) {
        System.out.println("输入一个数字:");
        int a=sc.nextInt();
        System.out.println("输入的一个数字是:"+a);
    }
    public static Scanner methodReturu(){
        return  new Scanner(System.in);
    }
}
