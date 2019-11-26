package com.huidian.day6.demo02;/*
@outhor shkstart
@date 2019/11/26-9:29
*/

public class Outer {
    int num=10;
    public class Inner{
        int num=20;
        public void methodInner(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
