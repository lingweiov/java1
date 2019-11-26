package com.huidian.day6.demo04;/*
@outhor shkstart
@date 2019/11/26-10:06
*/

public class DemoMain {
    public static void main(String[] args) {
        MyInterface obj1 = new MyInterfaceImpl();
        obj1.method1();
        obj1.method2();
      MyInterface obj=new MyInterface() {
          @Override
          public void method1() {
              System.out.println("匿名内部类实现了方法111a");

          }

          @Override
          public void method2() {
              System.out.println("匿名内部类实现了方法222a");

          }


      };//匿名内部类
      obj.method1();
      obj.method2();
       new MyInterface() {
          @Override
          public void method1() {
              System.out.println("匿名内部类实现了方法111b");
          }

          @Override
          public void method2() {
              System.out.println("匿名内部类实现了方法222b");
          }


      }.method2();//匿名内部类的匿名对象

    }
}
