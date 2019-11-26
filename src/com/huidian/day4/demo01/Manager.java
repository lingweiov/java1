package com.huidian.day4.demo01;/*
@outhor shkstart
@date 2019/11/23-8:39
*/

import java.util.ArrayList;

public class Manager extends User {
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redList;
        }
        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public Manager() {
    }
}
