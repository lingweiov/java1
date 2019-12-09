package ov.day6.lambda.demo02Lambda;/*
@outhor shkstart
@date 2019/12/2-9:13
*/

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了 ");
            }
        });
        //Lambda,简化书写
        invokeCook(()->{
            System.out.println("吃饭了1 ");
        });
        //再省略
        invokeCook(()-> System.out.println("吃饭了1 "));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
