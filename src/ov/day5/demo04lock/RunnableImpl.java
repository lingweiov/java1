package ov.day5.demo04lock;/*
@outhor shkstart
@date 2019/11/29-17:32
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private int tichet = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();

            if (tichet > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() +
                            "-->正在卖第" + tichet + "张票");
                    tichet--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();

                }

            }
        }
    }

    /*@Override
    public void run() {
        while (true) {
            l.lock();

            if (tichet > 0) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() +
                        "-->正在卖第" + tichet + "张票");
                tichet--;
            }
            l.unlock();
        }
    }*/
}
