package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-14:12
*/

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
      int num=  r.nextInt();//规的所有正负数定范围内
        System.out.println("随机数是："+num);
        for (int i = 0; i < 20; i++) {
            int num1=r.nextInt(10);//范围是：[0,10)
            if(i==9){
                System.out.print("随机数是："+num1);

            }else{            System.out.print("随机数是："+num1+",");
            }
        }
    }
}
