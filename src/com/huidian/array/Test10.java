package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-20:03
数组异常
越界异常;超出数组索引应用
空指针异常拆分后没有使用new
获取数组长度
arr.length;
数组一旦创建，程序运行期间，数组长度不可改变
*/

public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int a = arr.length;
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        };
        int b = arr1.length;
        System.out.println(a);
        System.out.println(b);
        int[] arr2=new int[3];
        System.out.println(arr2.length);
        arr2=new int[5];
        System.out.println(arr2.length);

    }
}
