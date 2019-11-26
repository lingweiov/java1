package com.huidian.day5.demo05;/*
@outhor shkstart
@date 2019/11/25-16:13
*/

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
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
