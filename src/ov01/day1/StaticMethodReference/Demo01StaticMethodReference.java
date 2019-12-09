package ov01.day1.StaticMethodReference;/*
@outhor shkstart
@date 2019/12/9-17:20
*/

public class Demo01StaticMethodReference {
    public static int method(int number,Calcable c ) {
        return c.cacl(number);
    }

    public static void main(String[] args) {
        int number = method(-10, (n) -> {
            return Math.abs(n);
        });
        System.out.println(number);
        int number2 = method(-10, Math::abs);
        System.out.println(number2);
    }
}
