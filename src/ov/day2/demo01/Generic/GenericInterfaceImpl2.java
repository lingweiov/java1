package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-17:21
*/

public class GenericInterfaceImpl2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
