package com.huidian.day4.demo07;/*
@outhor shkstart
@date 2019/11/23-16:29
*/

public interface MyInterfacePrivateB {
    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();

    }
    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }
      static void methodStaticCommon(){
        //解决私有使用问题，在java9中使用private
       //1.普通私有方法，解决多个默认方法之间重复代码问题、
       //g格式：private 返回值类型 方法名称（参数列表）{方法体}
       //2.静态私有方法：解决多个静态方法之间重复代码问题
       // 格式：private static 返回值类型 方法名称（参数列表）、

        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
    }
    //private void method(){ }


}
