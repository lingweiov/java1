package com.huidian.day6.demo03;/*
@outhor shkstart
@date 2019/11/26-9:51
*/

public class MyOuter {
    public void methodOuter(){
        int num=10;
        //num=20;//方法中的内部类如果想要访问方法的局部变量，
        // 那么这个局部变量就不能重新赋值，
        // 也就是说这个局部变量是一个final型变量
        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
