package ov.day4.demo06;/*
@outhor shkstart
@date 2019/11/29-17:18
*/

public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小七");
        mt.start();
        new MyThread("小八").start();
    }
}
