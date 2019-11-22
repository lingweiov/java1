package com.huidian.over;/*
@outhor shkstart
@date 2019/11/20-16:47
方法重载
*/

public class demo01 {
    public static void main(String[] args) {
        System.out.println(sum(10,1,21,24));
    }
    public static int sum (int a,int b){
    return a+b;
    }
    public static int sum (int a,int b,int c){
        return a+b+c;
    }
    public static int sum (int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static int sum (double a,double b){
        return (int)(a+b);
    }
    public static int sum (double a,int b){
        return (int)(a+b);
    }
    public static int sum (int a,double b){
        return (int)(a+b);
    }
   /* public static int sum (double x,int y){
        return (int)(a+b);
    }
    public static double sum(double a,int b){
        return (int)(a+b);
    }
    *重复*/
}
