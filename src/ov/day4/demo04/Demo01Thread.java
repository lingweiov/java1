package ov.day4.demo04;/*
@outhor shkstart
@date 2019/11/29-16:46
*/

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
       // mt.run();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
