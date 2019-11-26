package com.huidian.day4.demo07;/*
@outhor shkstart
@date 2019/11/23-16:29
*/

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public interface MyInterfacePrivateA {
    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodCommon();

    }
    public default void methodDefault2() {
        System.out.println("默认方法2");
        methodCommon();
    }
   public static void methodCommon(){
        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
    }
    //private void method(){ }


}
