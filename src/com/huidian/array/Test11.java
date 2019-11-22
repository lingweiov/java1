package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-20:21
遍历数组就是对数组当中的每一个元素进行逐一，挨个处理，默认的处理方式是打印输出

*/

public class Test11 {
    public static void main(String[] args) {
int[] arr={12,23,45,65,767,34,15};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("===========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("===========");
    }
}
