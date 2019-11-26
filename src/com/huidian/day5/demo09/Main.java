package com.huidian.day5.demo09;
import java.util.*;
/**
 * Author:jinpma
 * Date :2019/9/14
 */
/*
1.名称：发红包案例
2.实现目标：输入红包总金额，红包个数，每个人随机抢到0.01¥~剩余钱数平均值的2倍
3.注意事项：分为最小单位，每个红包保留两位小数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入，总金额
        System.out.println("输入，总金额");
        int totalMoney = sc.nextInt();
        //输入，分发红包的个数
        System.out.println("输入，分发红包的个数");
        int totalCont = sc.nextInt();
         Method method=new Method();
       method.sendMoney1(totalMoney,totalCont );
        System.out.println(method.divide(totalMoney, totalCont).get(0));
        System.out.println(method.divide(totalMoney, totalCont).toString());
        // method.sendMoney2(totalMoney,totalCont);


    }


}

