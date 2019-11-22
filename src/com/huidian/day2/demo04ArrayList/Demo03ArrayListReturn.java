package com.huidian.day2.demo04ArrayList;/*
@outhor shkstart
@date 2019/11/21-15:50
*/

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Random;

public class Demo03ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList=getSmallList(bigList);
        System.out.println("偶数有"+smallList.size()+"个");
        for (int i = 0; i < smallList.size(); i++) {
            if(i==smallList.size()-1){
                System.out.print(smallList.get(i));

            }else{
                System.out.print(smallList.get(i)+",");
            }
        }

    }

    //此方法接受大集合参数，返回小集合数据
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }

        return smallList;
    }
}
