package ov.day2.demo01.Generic;/*
@outhor shkstart
@date 2019/11/27-17:19
*/

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);
        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(1.9);
    }
}
