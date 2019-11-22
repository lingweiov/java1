package com.huidian.array;/*
@outhor shkstart
@date 2019/11/20-18:16
*/

import java.net.SocketTimeoutException;

public class Test03 {
    public static void main(String[] args) {
        int[] result=caculate(12,34,56);
        System.out.println("总和："+result[0]);
        System.out.println("平均数："+result[1]);
    }
    public static int[] caculate (int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        /*int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;*/
        int[] array={sum,avg};
        return array;

    }
}
