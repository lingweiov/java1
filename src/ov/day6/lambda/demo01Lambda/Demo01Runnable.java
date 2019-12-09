package ov.day6.lambda.demo01Lambda;/*
@outhor shkstart
@date 2019/12/2-8:50
*/

public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        System.out.println("1=====================");
        Runnable r = new Runnable() {
            @Override
            public void run() {
  System.out.println(Thread.currentThread().getName()+"新线程创建了1");
            }
        };
        new Thread(r).start();
        System.out.println("2============================");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了2");
            }
        }).start();


    }
}
