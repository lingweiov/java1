package com.huidian.method;/*
@outhor shkstart
@date 2019/11/20-15:40
方法
有参数 小括号里有内容，
当一个方法需要一些数据条件才能完成任务时，就是有参数、

无参数 小括号里为空，
当一个方法不需要任何数据条件自己就能完成任务时，就是无参数、
*/



public class Test01 {
    public static void main(String[] args) {
        method(12,16);
        method2();
    }
    //有参数
    public static void method(int a,int b) {
        int result=a*b;
        System.out.println("结果是："+result);
    }
    //无参数
    public static void method2( ) {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld"+i);

        }
    }
}
