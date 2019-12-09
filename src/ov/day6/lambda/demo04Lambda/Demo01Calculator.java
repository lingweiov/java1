package ov.day6.lambda.demo04Lambda;/*
@outhor shkstart
@date 2019/12/2-9:38
*/

public class Demo01Calculator {
    public static void main(String[] args) {
        /*invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });*/
        //使用lambda简化
        invokeCalc(10, 20, (int a, int b) -> {
            return a + b;
        });
        //再省略
        invokeCalc(10, 20, (int a, int b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);

    }
}
