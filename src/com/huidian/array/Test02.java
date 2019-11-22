package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-18:11
*/

public class Test02 {
    public static void main(String[] args) {
        int[] array={1,23,24,89,46,78};
        printArray(array);
        System.out.println("======");
        printArray(array);
    }
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
