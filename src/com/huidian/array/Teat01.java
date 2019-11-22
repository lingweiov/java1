package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-17:54
*/

public class Teat01 {
    public static void main(String[] args) {
        int[] array={1,23,24,89,46,78};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");
        for(int min=0,max=array.length-1;min<max;min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
