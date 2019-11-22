package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-19:32
动态数组的使用
*/

public class Test07 {
    public static void main(String[] args) {
        int[] array=new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("==========");
        array[1]=123;
        array[2]=12;

        System.out.println(array[0]);//0
        System.out.println(array[1]);//123
        System.out.println(array[2]);//12
    }
}
