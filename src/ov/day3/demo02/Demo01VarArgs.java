package ov.day3.demo02;/*
@outhor shkstart
@date 2019/11/28-15:55
*/

import java.util.Objects;

public class Demo01VarArgs {
    public static void main(String[] args) {
        // int i= add();
        //int i= add(10);
        int i = add(10, 20);
        System.out.println(i);
        //method("abc", 0.9, 10, 12, 21, 1, 4, 5);
        method("abc", 0.9, 10, 12, 21, 1, 4, 5);
    }

    /*public static void method(int...a,String...b){
    }*/
   /* public static void method(String b, double c, int d, int... a) {
    }*/
    public static void method(Object...obj){
    }

    public static int add(int... arr) {
        /*System.out.println(arr);
        System.out.println(arr.length);*/
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;

    }

   /* public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b,int c) {
        return a + b+c;
    }*/
}
