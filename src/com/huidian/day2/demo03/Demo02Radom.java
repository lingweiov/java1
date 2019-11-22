package com.huidian.day2.demo03;/*
@outhor shkstart
@date 2019/11/21-14:31
*/

import java.util.Random;

public class Demo02Radom {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();

        for (int i = 0; i < 20; i++) {
            int result=r.nextInt(n)+1;
            if(i==19){System.out.print(result);
            }else{
                System.out.print(result+",");
            }

        }
    }
}
