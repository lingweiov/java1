package com.huidian.day4.demo01;/*
@outhor shkstart
@date 2019/11/23-8:57
*/

import java.util.ArrayList;
import java.util.Random;

public class Momber extends User {
    public Momber(String name, int money) {
        super(name, money);
    }

    public Momber() {
    }
    public void receive(ArrayList<Integer> list){
        int index=new Random().nextInt(list.size());
       int dele= list.remove(index);
       int money=super.getMoney();
        super.setMoney(money+dele);
    }
}
