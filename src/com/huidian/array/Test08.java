package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-19:32
动态数组的使用
*/

public class Test08 {
    public static void main(String[] args) {
        int[] array1=new int[3];
        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println("==========");
        array1[1]=123;
        array1[2]=12;

        System.out.println(array1[0]);//0
        System.out.println(array1[1]);//123
        System.out.println(array1[2]);//12
        System.out.println("===============");
        int[] array12=new int[3];
        System.out.println(array12);
        System.out.println(array12[0]);
        System.out.println(array12[1]);
        System.out.println(array12[2]);
        System.out.println("==========");
        array12[1]=100;
        array12[2]=1200;

        System.out.println(array12[0]);
        System.out.println(array12[1]);
        System.out.println(array12[2]);
        System.out.println("===============");
    }
}
