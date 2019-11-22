package com.huidian.duiXiang;/*
@outhor shkstart
@date 2019/11/20-23:11
面向过程：当需要实现一个功能时，每一个步骤都要亲历实现,详细处理每一个细节
面向对象;当需要实现一个功能时，不关心具体的步骤，而是找一个已经具有该功能的人，来帮忙做事
面向对象特点：封装性，继承性，多态性
类:相关属性和行为的集合，一类事物，抽象的
对象：相关属性和行为的集合，具体事物，具体的，根据某一个类创建的实例或具体事物
*/

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
int[] arr={10,12,34,56,43,98,87};
//使用面向过程
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
        System.out.println("===========");
        //面向对象
        System.out.println(Arrays.toString(arr));
    }
}
