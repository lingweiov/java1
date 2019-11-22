package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-14:39
*/

import java.util.Random;
import java.util.Scanner;

public class Demo03RadomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;//[1,100]
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入你猜的数字：");
            int getNum = sc.nextInt();
            if(getNum>randomNum){
                System.out.println("太大了！！");
            }else if (getNum<randomNum){
                System.out.println("太小了！！");
            }else{
                System.out.println("恭喜你答对了");
                break;//如果猜中游戏结束
            }
        }

        System.out.println("游戏结束");

    }
}
