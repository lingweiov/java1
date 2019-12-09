package ov.day4.demo04;/*
@outhor shkstart
@date 2019/11/29-16:48
*/

public class MyThread extends  Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}
