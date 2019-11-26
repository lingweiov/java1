package com.huidian.day3.demo11;/*
@outhor shkstart
@date 2019/11/22-23:41
*/

public class Zi extends Fu {
    int num=20;

    public Zi() {
        this(123);//super和this不能同时使用，都是只能放在方法中第一行语句
       // this(123,234);错误this只能用一次
    }
    public Zi(int n) {
        this(2,3);
    }
    public Zi(int m,int n) {
        //this();不能来回互相调用，形成死循环
    }
    public void showNum(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void method1(){
        System.out.println("aaa");
    }
    public void method2(){
        method1();
        this.method1();
        System.out.println("bbb");
    }

}
