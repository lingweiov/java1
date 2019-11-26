package com.huidian.day6.demo03;/*
@outhor shkstart
@date 2019/11/26-9:40
*/

public class Outer {
    public void methodOuter() {
        class Inner {
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.methodInner();
        System.out.println(inner.num);
    }

}
