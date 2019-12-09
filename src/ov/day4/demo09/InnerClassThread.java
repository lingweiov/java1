package ov.day4.demo09;/*
@outhor shkstart
@date 2019/11/29-20:12
*/

public class InnerClassThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"慧点");
                }
            }
        }.start();
       Runnable r= new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"程序员");
                }
            }
        };
       new Thread(r).start();
       new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                   System.out.println(Thread.currentThread().getName()+"ov");
               }
           }
       }).start();

    }
}
