package com.huidian.day3.demo04;/*
@outhor shkstart
@date 2019/11/22-16:32
*/

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArr={10,20,30};
        //将int[]数组按照默认模式变成字符串
        String intStr= Arrays.toString(intArr);
        System.out.println(intStr);
        int[] arr1={12,2,6,3,9,3,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        String[] arr2={"aaa","ssss","bbbb"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
