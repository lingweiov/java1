package com.huidian.day3.demo01;/*
@outhor shkstart
@date 2019/11/22-10:02
*/

public class Demo01StringPractise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        String result=fromArrayToString(arr);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += "word" + arr[i] + "]";
            } else {
                str += "word" + arr[i] + "#";
            }
        }
        return str;
    }
}
