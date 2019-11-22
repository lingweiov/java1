package com.huidian.day2.demo02;/*
@outhor shkstart
@date 2019/11/21-10:20
method(方法)：
面向对象三大特征：封装，继承，多态
封装在java当中的体现
方法是一种封装
private另一种封装
封装就是讲一些细节信息隐藏起来，对于外界不可见
*/

public class Demo02Method {
    public static void main(String[] args) {
        int[] arr={1,23,45,67,234};
        int max=getMax(arr);
        System.out.println("最大值："+max);

    }
    public static int getMax(int[] arr ) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
return max;
    }
}
