package com.huidian.day3.demo04;/*
@outhor shkstart
@date 2019/11/22-16:16
*/

import java.util.Arrays;

public class Demo02ArraysPractises {
    public static void main(String[] args) {
        String str ="assadfsdflsdgfjkf32454;'.";
        //如何进行升序排列 sort
        //必须是一个数字，才能使用Arrays.sort方法
        //string----->数组，使用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列
        //正序遍历
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println();
        System.out.println("==================");
        //需要倒序遍历
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]+" ");
        }


    }
}
