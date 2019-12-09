package ov.day4.dmeo08.runable;/*
@outhor shkstart
@date 2019/11/29-17:32
*/

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
