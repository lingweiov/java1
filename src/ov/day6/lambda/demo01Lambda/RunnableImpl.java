package ov.day6.lambda.demo01Lambda;/*
@outhor shkstart
@date 2019/12/2-8:51
*/

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}
