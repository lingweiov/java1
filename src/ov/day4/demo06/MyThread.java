package ov.day4.demo06;/*
@outhor shkstart
@date 2019/11/29-16:48
*/

public class MyThread extends  Thread{
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {

    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
