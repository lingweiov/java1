package ov.day5.demo10.WaitAntNotify;/*
@outhor shkstart
@date 2019/11/30-17:16
*/

public class Demo01WaitAntNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true){
                    System.out.println("告知老板要的包子的种类和数量");
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，开吃");
                        System.out.println("--------------------");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
               while (true){
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (obj) {
                       System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子了");
                       obj.notify();
                   }
               }
            }
        }.start();
    }
}
