package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-17:14
*/

public class GenericInterfaceImpl1 implements GenericInterface<String>{



    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
