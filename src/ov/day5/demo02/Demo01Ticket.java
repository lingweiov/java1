package ov.day5.demo02;/*
@outhor shkstart
@date 2019/11/29-21:05
*/

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        System.out.println("run:"+run);
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
