package ov.day6.lambda.demo01Lambda;/*
@outhor shkstart
@date 2019/12/2-9:04
*/

public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了1");
            }
        }).start();
        //使用lambta表达式实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新线程创建了2");
        }).start();

        //再省略
        new Thread(() ->
            System.out.println(Thread.currentThread().getName() + "新线程创建了2")
         ).start();

    }
}
