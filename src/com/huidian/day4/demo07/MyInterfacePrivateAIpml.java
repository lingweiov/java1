package com.huidian.day4.demo07;/*
@outhor shkstart
@date 2019/11/23-16:36
*/

public class MyInterfacePrivateAIpml implements MyInterfacePrivateA {
public void methodAnother(){
    //methodCommon();
    MyInterfacePrivateA.methodCommon();
}

    public static void main(String[] args) {
       MyInterfacePrivateA.methodCommon();
    }
}
