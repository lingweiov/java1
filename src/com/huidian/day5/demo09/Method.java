package com.huidian.day5.demo09;/*
@outhor shkstart
@date 2019/11/25-20:49
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Method implements OpenMode{

        //总金额和红包总个数是不可变的，建议加上final修饰
        public static void sendMoney1(final double totalMoney,final int totalCount){
            //定义剩余的金额和剩余的红包个数
            double leftMoney = totalMoney;
            int leftCount = totalCount;
            //红包的大小是随机产生的，满足0.01¥-剩余金额的平均值的2倍即可
            Random ran = new Random();
            //比如，10¥发3个包，第一个红包大小为：0.01-（10/3）*2
            List<Double> list = new ArrayList<>();
            for (int i = 0; i < totalCount - 1; i++) {
                double money = ran.nextDouble()*(leftMoney/leftCount)*2 + 0.01;
                //将每次抢到的红包存到list集合中
                list.add(money);
                //剩余金额数=总金额-红包大小
                leftMoney = leftMoney - money;
                leftCount --;
            }
            //最后一个红包大小即为剩余的金额
            list.add(leftMoney);
            for (Double j : list) {
                System.out.printf("%.2f",j);
                System.out.println();
            }
        }
        @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;
    }

}
