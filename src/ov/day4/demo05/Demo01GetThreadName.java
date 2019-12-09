package ov.day4.demo05;/*
@outhor shkstart
@date 2019/11/29-16:46
*/



public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
         new MyThread().start();
         new MyThread().start();
        System.out.println(Thread.currentThread().getName());

    }
}
