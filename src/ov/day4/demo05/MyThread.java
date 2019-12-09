package ov.day4.demo05;/*
@outhor shkstart
@date 2019/11/29-16:48
*/

public class MyThread extends  Thread{
    @Override
    public void run(){
      /* String name=getName();
        System.out.println(name);*/
       /* Thread t = Thread.currentThread();
        System.out.println(t);
        String name = t.getName();
        System.out.println(name);*/
        System.out.println(Thread.currentThread().getName());
    }
}
