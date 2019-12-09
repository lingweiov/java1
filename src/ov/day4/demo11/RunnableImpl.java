package ov.day4.demo11;/*
@outhor shkstart
@date 2019/11/29-17:32
*/

public class RunnableImpl implements Runnable {
    private int tichet = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
           synchronized (obj){if (tichet > 0) {
               try {
                   Thread.sleep(5);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(Thread.currentThread().getName() +
                       "-->正在卖第" + tichet + "张票");
               tichet--;
           }
           }
        }
    }
}
