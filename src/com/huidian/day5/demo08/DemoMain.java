package com.huidian.day5.demo08;/*
@outhor shkstart
@date 2019/11/23-21:32
*/

public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        USB usbMouse=new Mouse();
        computer.useDevice(usbMouse);
        Keyboard keyboard=new Keyboard();
        computer.useDevice(keyboard);
        computer.useDevice(new Keyboard());
        computer.powerOff();
        method(10.0);
        method(11);
        int a=30;
        method(a);
    }
    public static void method(double num){
        System.out.println(num);
    }

}
