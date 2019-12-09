package ov.day5.demo02ThreadPool;/*
@outhor shkstart
@date 2019/12/2-8:39
*/

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
