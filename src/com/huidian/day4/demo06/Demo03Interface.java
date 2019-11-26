package com.huidian.day4.demo06;/*
@outhor shkstart
@date 2019/11/23-16:17
*/




public class Demo03Interface {
    public static void main(String[] args) {
       // MyInterfaceStaticImpl impl=new MyInterfaceStaticImpl();
       // impl.methodStatic();//错误写法，
        // 不能通过接口实现类的对象来调用接口当中的静态方法
         MyInterfaceStatic.methodStatic();
         //正确调用接口当中的静态方法的用法
    }
}
