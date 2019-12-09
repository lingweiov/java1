package ov.day4.dmeo08.runable;/*
@outhor shkstart
@date 2019/11/29-17:31
*/

public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
       // Thread t=new Thread(run);
        Thread t=new Thread(new RunnableImpl2());
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }

}
