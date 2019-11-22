package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-11:10
scanner类的功能;可以实现键盘输入数据到程序当中
引用类型的一般使用步骤：
1.导包
只有java.lang包下的内容不需要导包
2.创建
类名 对象名= new 类名([参数]):

3.使用
对象名.成员方法（【参数】）;
比如：获取键盘输入的数字:int a= sc.nextInt();
获取键盘输入的字符串:String str=sc.next();
*/

import java.util.Scanner;//导包

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//2.创建,System.in表示键盘输入数据到程序当中
        System.out.print("输入数字：");
       int a= sc.nextInt();
        System.out.println("输入的数字："+a);
        System.out.print("输入字符串：");
        String str=sc.next();
        System.out.print("输入的字符串："+str);

    }

}
