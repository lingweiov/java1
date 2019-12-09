package ov.day5.demo02ThreadPool;/*
@outhor shkstart
@date 2019/11/30-18:06
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.shutdown();
       // es.submit(new RunnableImpl());
        // 错误，es.shutdown();之后线程池就没有了，就不能获取线程了
    }
}
