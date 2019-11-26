package com.huidian.day4.demo05;/*
@outhor shkstart
@date 2019/11/23-15:50
*/

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

public interface MyInterfaceDeault {
    public abstract void methodAbs();
   // public abstract void methodAbs2();
public default void methodDefault(){
    System.out.println("这是新添加的默认方法");
}
}
